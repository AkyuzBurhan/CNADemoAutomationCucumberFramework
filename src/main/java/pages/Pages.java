package pages;

import pages.BasePage;
import pages.HomePage;

public class Pages extends BasePage {

    private HomePage denemePage;

    public Pages(){
        this.denemePage = new HomePage();
    }

    public HomePage getDenemePage(){
        return denemePage;
    }
}
