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

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@data-testid='Home']")
    WebElement accountPageHeader;
    @CacheLookup
    @FindBy(xpath = "//div[@dir='auto' and contains(text(),'Add Seizure')]")
    WebElement addSeizureButton;
    @CacheLookup
    @FindBy(xpath = "//div[@dir='auto' and contains(text(),'Type')]/following-sibling::div/div/div")
    WebElement seizureType;
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement focalAwareSeizure;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Validate')]")
    WebElement validateButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement feltNoRadio;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Save')]")
    WebElement saveButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Close')]")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]")
    WebElement focalAwareText;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]")
    WebElement editCalender;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[25]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]")
    WebElement editItem;
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement generalizedSeizure;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[2]/div[1]/img[1]")
    WebElement homeButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]")
    WebElement generalizedText;

    public String getAccountPageHeader() {
        log.info("Getting text from Account Page Header " + accountPageHeader.toString());
        return getTextFromElement(accountPageHeader);
    }

    public void clickOnAddSeizureButton() {
        clickOnElement(addSeizureButton);
        log.info("Click on Add Seizure " + addSeizureButton.toString());
    }

    public void clickOnSeizureType() {
        clickOnElement(seizureType);
        log.info("Click on Seizure Type " + seizureType.toString());
    }

    public void clickOnFocalAwareSeizure() {
        clickOnElement(focalAwareSeizure);
        log.info("Click on Focal Aware Seizure " + focalAwareSeizure.toString());
    }

    public void clickOnValidateButton() {
        clickOnElement(validateButton);
        log.info("Click on Validate Button " + validateButton.toString());
    }

    public void clickOnFeltNoRadioButton() {
        clickOnElement(feltNoRadio);
        log.info("Click on Felt No Radio Button " + feltNoRadio.toString());
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        log.info("Click on Save Button " + saveButton.toString());
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
        log.info("Click on Close Button " + closeButton.toString());
    }

    public String getFocalAwareText() {
        log.info("Getting text from account Page " + focalAwareText.toString());
        return getTextFromElement(focalAwareText);
    }

    public void clickOnEditCalender() {
        clickOnElement(editCalender);
        log.info("Click on Edit Calender " + editCalender.toString());
    }

    public void clickOnEditItem() {
        clickOnElement(editItem);
        log.info("Click on Edit item " + editItem.toString());
    }

    public void clickOnGeneralSeizure() {
        clickOnElement(generalizedSeizure);
        log.info("Click on Generalized Seizure " + generalizedSeizure.toString());
    }

    public void clickOnHomeButton() {
        clickOnElement(homeButton);
        log.info("Click on Home Button " + homeButton.toString());
    }

    public String getGeneralizedText() {
        log.info("Getting text Generalized Text " + generalizedText.toString());
        return getTextFromElement(generalizedText);
    }
}

