package tests;

import actions.DisplayedArticle;
import actions.NavigateActions;
import actions.SearchActions;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import steps.DisplayArticlesSteps;
import steps.NavigateSteps;
import steps.SearchSteps;

public abstract class BaseRunnerClass {

    private EnvironmentVariables environmentVariables;

    @Steps
    protected NavigateSteps navigateSteps;

    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected DisplayArticlesSteps displayArticlesSteps;

    public String getEnvProperty(String name) {
        //return environmentVariables.getProperty(name);
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(name);
    }

    public void printValue() {
        System.out.println("Value = " + getEnvProperty("search.keyword"));
    }
}
