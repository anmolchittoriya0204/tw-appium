package element_repositories;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class WelcomeScreen extends BaseScreen {
	
	/* Locators start from here*/
	
    @AndroidFindBy(xpath = "//android.widget.Button")
    private WebElement getStartButton;
    
    /* Locator end here */
    
    //Methods

    public void clickStartButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        getStartButton.click();
        Thread.sleep(2000);
    }
}
