package co.uk.wickes.pages;

import co.uk.wickes.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildingAndMaterialsPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildingAndMaterialsPage.class.getName());

    public BuildingAndMaterialsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Roof Felt']")
    WebElement roofFelt;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Roof Felt')]")
    WebElement verifyRoofFelt;

    @CacheLookup
    @FindBy(xpath = "//img[@title='IKO Black Shed Felt - 10 x 1m']")
    WebElement blackShedFelt;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'IKO Black Shed Felt - 10 x 1m')]")
    WebElement verifyIko;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity-field']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity-field']")
    WebElement addQuantity;


    public void clickOnRoofFelt() {
        log.info("mouse hover on Elements"+ roofFelt.toString());
        mouseHoverToElementAndClick(roofFelt);
    }

    public String verifyRoofFelt() {
        log.info("Verify the text"+verifyRoofFelt.toString());
        return getTextFromElement(verifyRoofFelt);

    }

    public void clickOnBlackShedFelt() {
        log.info("Click On Element"+blackShedFelt.toString());
        clickOnElement(blackShedFelt);

    }

    public String verifyIkoBlackShed(){
        log.info("Verify the BlackShed "+verifyIko.toString());
        return getTextFromElement(verifyIko);
    }

    public void clearQuantity() {
        log.info("Clear the text from quantity"+quantity.toString());
        clearTextFromField(quantity);

    }

    public void addQuantity(String value) {
        log.info("Add Quantity value "+addQuantity.toString());
        sendTextToElement(addQuantity, value);


    }


}
