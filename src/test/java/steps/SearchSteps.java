package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchSteps extends BaseStepsClass {

    @Step("Search by keyword '{0}'")
    public void searchBy(String keyword) {
        search.searchBy(keyword);
    }

}
