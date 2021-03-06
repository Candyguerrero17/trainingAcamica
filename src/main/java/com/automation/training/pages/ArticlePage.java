package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage{
	
	public ArticlePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="firstHeading")
	private WebElement pageTitle;
	
	@FindBy(linkText="Privacy policy")
	private WebElement privacyLink;
	
	@FindBy(css="[id='searchInput']")
	private WebElement searchInput;
	
	@FindBy(css="#searchButton")
	private WebElement searchButton;
	
	public String getPageTitle() {
		return pageTitle.getText();
	}
	
	public ArticlePage search(String busqueda) {
		searchInput.sendKeys(busqueda);
		searchButton.click();
		return new ArticlePage(getDriver());
	}
}
