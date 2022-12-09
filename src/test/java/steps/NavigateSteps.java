package steps;

import net.thucydides.core.annotations.Step;

public class NavigateSteps extends BaseStepsClass {

    @Step("Navigate to the home page")
    public void goToTheHomePage() {
        navigate.goToTheHomePage();
    }

    @Step("Get list of MENU Items")
    public void getListOfMenuItems() {
        navigate.getListOfMenuItems();
        navigate.filterElements();
    }

}
