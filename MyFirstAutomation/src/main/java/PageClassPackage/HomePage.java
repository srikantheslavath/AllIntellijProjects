package PageClassPackage;

import org.BasePackage.BaseTest;

public class HomePage extends BaseTest {

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }
}
