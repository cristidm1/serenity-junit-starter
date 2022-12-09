package actions;

import net.thucydides.core.util.EnvironmentVariables;

public class BasePagesClass {

    private EnvironmentVariables environmentVariables;

    public String getEnvProperty(String name) {
        return environmentVariables.getProperty(name);
    }
}
