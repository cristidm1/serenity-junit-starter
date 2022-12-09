package tests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTermsTest extends BaseRunnerClass {

    @Test
    void searchBySingleKeyword() {
        navigateSteps.goToTheHomePage();
        searchSteps.searchBy("Everest");
        Serenity.reportThat("The first heading should be 'Mount Everest'",
                () -> assertThat(displayArticlesSteps.getFirstHeading()).isEqualTo("Mount Everest")
        );
    }

    @Test
    void testTheProperty() throws InterruptedException {
        printValue();
        navigateSteps.goToTheHomePage();
        Thread.sleep(3000);
        navigateSteps.getListOfMenuItems();
    }
}
