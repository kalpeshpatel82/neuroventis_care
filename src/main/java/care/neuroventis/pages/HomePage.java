package care.neuroventis.pages;
/* 
 Created by Kalpesh Patel
 */

import care.neuroventis.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='css-view-175oi2r r-alignItems-1awozwy r-flexDirection-18u37iz r-justifyContent-1777fci r-marginBottom-1y1xsc3']/div[2]")
    WebElement nextRadioButton;
    @CacheLookup
    @FindBy(xpath = "//div[@data-testid='Lets go']")
    WebElement letsGoButton;
    @CacheLookup
    @FindBy(xpath = "//div[@dir='auto' and contains(text(),'Hi!')]")
    WebElement loginPageHeader;
    @CacheLookup
    @FindBy(xpath = "//div[@dir='auto' and contains(text(),'I already have an account')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div/input[@data-testid='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//div/input[@data-testid='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//div[@data-testid='Log In']")
    WebElement logInButton;

    public void clickOnRadioNextButton(){
        clickOnElement(nextRadioButton);
        log.info("Click on Next Radio Button " + nextRadioButton.toString());
    }
    public void clickOnLetsGoButton(){
        clickOnElement(letsGoButton);
        log.info("Click on Lets Go Button " + letsGoButton.toString());
    }
    public String loginPageHeader(){
        log.info("Getting text from Login Page Header " + loginPageHeader.toString());
        return getTextFromElement(loginPageHeader);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Click on I already have an account " + loginButton.toString());
    }
    public void sendTextToEmailField(String text){
        sendTextToElement(emailField,text);
        log.info("Send Text to Email Field" + emailField.toString());
    }

    public void sendTextTPasswordField(String text){
        sendTextToElement(passwordField,text);
        log.info("Send Text to Email Field" + passwordField.toString());
    }
    public void clickOnLogin(){
        clickOnElement(logInButton);
        log.info("Click on Login Button" + logInButton.toString());
    }

}
