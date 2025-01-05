package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{


    /*
        .get(0)- Industries
        .get(1)- Products&Solutions
        .get(2)- Risk Control
        .get(3)- Claims Center
        .get(4)- Find An Agent
        .get(5)- Agent Login
     */
    @FindBy(xpath = "//*[@data-element-type='we-mega-menu-li']")
    public List<WebElement> topMenu;



    @FindBy(xpath = "//select[@id='edit-states']")
    public WebElement selectState;

    @FindBy(id = "findagentmenuSubmit")
    public WebElement findMenuButton;

    @FindBy(xpath = "//*[@class='find-an-agent-pagination-heading']")
    public WebElement agentFinderTableHeader;

    @FindBy(xpath = "//*[@class='agent_address']")
    public List<WebElement> agentList;

    @FindBy(xpath = "//*[text()='Continue >>']")
    public WebElement cookies;
}
