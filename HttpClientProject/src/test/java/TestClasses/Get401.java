package TestClasses;

import BaseClassPackage.BaseClass;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class Get401 extends BaseClass {
    @DataProvider
    private Object[][] endpoints() {
        return new Object[][]{

                {"/user/followers"},
                {"/notifications"},
                {"/names"}
        };
    }

    @Test(dataProvider = "endpoints")
    public void userReturns401(String endpoint) throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + endpoint);
        response = client.execute(get);
        int actualstatus = response.getStatusLine().getStatusCode();
      assertEquals(actualstatus,401);
    }
}
