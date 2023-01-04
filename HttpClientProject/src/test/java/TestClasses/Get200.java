package TestClasses;

import BaseClassPackage.BaseClass;
import org.apache.http.client.methods.HttpGet;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class Get200 extends BaseClass {
    @Test
    public void ratelimitReturns2c00() throws IOException {
        HttpGet get =new HttpGet((BASE_ENDPOINT+"/rate_limit"));
        response=client.execute(get);
        int actualstatus = response.getStatusLine().getStatusCode();
        assertEquals(actualstatus,200);
    }

    @Test
    public void searchreturns200() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT+"/search/commits?q=java");
        response =client.execute(get);
        System.out.println(response);
        int actualstatus =response.getStatusLine().getStatusCode();
        assertEquals(actualstatus,200);

    }
}

