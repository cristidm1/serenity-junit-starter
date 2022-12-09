package actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class NavigateActions extends UIInteractions {

    private static final By MENU_ITEMS = By.cssSelector(".navbar-nav .nav-item");

    public void goToTheHomePage() {
        //openUrl("http://wikipedia.com/");
        open();
    }

    public List<String> getListOfMenuItems() {
        List<String> menuItemsList = findAll(MENU_ITEMS).stream()
                                          .map(WebElementFacade::getText)
                                          //.filter(a -> a.startsWith("C"))
                                          .collect(Collectors.toList());
        System.out.println("List of the Menu Items: " + menuItemsList);
        return menuItemsList;
    }

    public List<String> filterElements() {
        List<String> filteredItems = getListOfMenuItems().stream().filter(item -> item.startsWith("C")).collect(Collectors.toList());
        System.out.println("List of the filtered Menu Items: " + filteredItems);
        return  filteredItems;
    }

    public void waitExample() {
        withTimeoutOf(Duration.ofSeconds(5)).elementIsCurrentlyVisible(MENU_ITEMS);
    }

}
