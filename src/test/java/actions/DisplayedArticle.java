package actions;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

//public class DisplayedArticle extends PageComponent {
public class DisplayedArticle extends BasePagesClass {

    @FindBy(id="firstHeading")
    private WebElementFacade firstHeading;

    public String getFirstHeading() {
        return firstHeading.getText();
    }
}
