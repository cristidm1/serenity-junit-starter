package steps;

import net.thucydides.core.annotations.Step;

public class DisplayArticlesSteps extends BaseStepsClass {

    @Step("Get first heading")
    public String getFirstHeading() {
        return displayedArticle.getFirstHeading();
    }

}
