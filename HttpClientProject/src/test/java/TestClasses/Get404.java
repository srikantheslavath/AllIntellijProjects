package TestClasses;

import BaseClassPackage.BaseClass;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class Get404 extends BaseClass {
 @Test
    public void NonExistingUrl() throws IOException {
        HttpGet get =new HttpGet(BASE_ENDPOINT+"/nonexistingurl");
        response=client.execute(get);
        int actualstatus =response.getStatusLine().getStatusCode();
        assertEquals(actualstatus,404);

    }
}
