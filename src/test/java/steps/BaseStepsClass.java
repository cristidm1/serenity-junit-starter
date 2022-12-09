package steps;

import actions.DisplayedArticle;
import actions.NavigateActions;
import actions.SearchActions;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseStepsClass {

    /**
     * Define the webdriver instance to be used for these tests
     */
    /*@Managed(driver = "chrome", options = "headless")
    WebDriver driver;*/
    @Managed
    WebDriver driver;

    /**
     * Navigation actions. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    NavigateActions navigate;

    /**
     * Actions related to searches. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    SearchActions search;

    /**
     * A page object representing a Wikipedia article that is currently appearing in the browser.
     * Page Objects are automatically initialised by Serenity.
     */
    DisplayedArticle displayedArticle;

}
