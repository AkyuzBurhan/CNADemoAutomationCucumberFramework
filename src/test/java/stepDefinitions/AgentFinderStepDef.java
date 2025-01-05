package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.AgentAdressExpectedData;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AgentFinderStepDef extends BaseStep {

    @Given("Go to the {string}")
    public void go_to_the(String url) {
        DRIVER.get(CONFIGLOADER.getConfigValue(url));
        ReusableMethods.hardWait(2);
        PAGES.getDenemePage().cookies.click();
        ReusableMethods.hardWait(2);
    }

    @Then("Click on the {string} button")
    public void click_on_the_button(String string) {
        // Use a utility method to click a button by its displayed text
        ReusableMethods.clickWithText(string);
        ReusableMethods.hardWait(3);
    }

    @Then("Select {string}")
    public void select(String string) {
        PAGES.getDenemePage().selectState.click();
        ReusableMethods.selectByVisibleText(PAGES.getDenemePage().selectState, string);
        ReusableMethods.hardWait(2);
    }

    @Then("Click on the Find button")
    public void click_on_the_find_button() {
        PAGES.getDenemePage().findMenuButton.click();
    }

    @Then("Verify that the agent list shows")
    public void verify_that_the_agent_list_shows() {
        assertTrue(PAGES.getDenemePage().agentFinderTableHeader.isDisplayed());
    }

    @Then("verify that the filtered agent information is correct")
    public void verify_that_the_filtered_agent_information_is_correct() {
        // Get all agent address table cells (td elements)
        List<WebElement> agentAddressTds = PAGES.getDenemePage().agentList;

        // Retrieve expected data for validation
        List<Map<String, String>> expectedData = AgentAdressExpectedData.getExpectedData().get(1);

        // Limit the iteration to the minimum size of actual and expected data
        int limit = Math.min(agentAddressTds.size(), expectedData.size());
        for (int i = 0; i < limit; i++) {
            WebElement td = agentAddressTds.get(i);

            // Extract all <p> elements within the table cell
            List<WebElement> paragraphs = td.findElements(By.tagName("p"));

            // Check if there are enough paragraphs for validation
            if (paragraphs.size() >= 3) {
                // İlk 3 <p>'yi verilen değerlere göre doğrula
                String actualCompanyName = paragraphs.get(0).getText().trim();
                String actualCompanyStreet = paragraphs.get(1).getText().trim();
                String actualCityStateZip = paragraphs.get(2).getText().trim();

                // Fetch expected values for comparison
                String expectedCompanyName = AgentAdressExpectedData.getExpectedData().get(1).get(i).get("name");
                String expectedCompanyStreet = AgentAdressExpectedData.getExpectedData().get(1).get(i).get("street");
                String expectedCompanyStateZip = AgentAdressExpectedData.getExpectedData().get(1).get(i).get("cityStateZip");

                // Perform assertions to verify correctness
                assert actualCompanyName.equals(expectedCompanyName);
                assert actualCompanyStreet.equals(expectedCompanyStreet);
                assert actualCityStateZip.equals(expectedCompanyStateZip);


                // Validate the 4th paragraph if it exists (expected to contain a URL)
                if (paragraphs.size() >= 4) {
                    WebElement fourthParagraph = paragraphs.get(3);
                    String url = fourthParagraph.getText().trim();


                    if (url.startsWith("http://") || url.startsWith("https://")) {

                        String mainWindowHandle = DRIVER.getWindowHandle();
                        fourthParagraph.click();
                        ReusableMethods.hardWait(2);

                        // Switch to the new tab
                        for (String windowHandle : DRIVER.getWindowHandles()) {
                            if (!windowHandle.equals(mainWindowHandle)) {
                                DRIVER.switchTo().window(windowHandle);
                                break;
                            }
                        }

                        // Verify the URL of the new tab
                        String currentUrl = DRIVER.getCurrentUrl();
                        String expectedUrl = AgentAdressExpectedData.getExpectedData().get(1).get(i).get("website");
                        assertEquals(expectedUrl, currentUrl);


                        // Close the new tab and switch back to the main window
                        DRIVER.close();
                        DRIVER.switchTo().window(mainWindowHandle);
                    }
                }

            }


        }
    }
}
