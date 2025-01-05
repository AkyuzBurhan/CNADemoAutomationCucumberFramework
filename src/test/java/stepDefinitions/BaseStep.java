package stepDefinitions;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import utilities.ConfigLoader;
import utilities.Driver;
import pages.Pages;

public abstract class BaseStep {

	protected final WebDriver DRIVER;

	protected static Pages PAGES;

	protected static ConfigLoader CONFIGLOADER;

	protected static Faker faker;

	public BaseStep() {
		DRIVER = Driver.getDriver();

		PAGES = new Pages();

		CONFIGLOADER = new ConfigLoader();

		faker = new Faker();
	}

}




