package actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {

    private static final By SEARCH_INPUT = By.cssSelector("#searchInput");
    public void searchBy(String keyword) {
        $(SEARCH_INPUT).sendKeys(keyword, Keys.ENTER);
    }
}
