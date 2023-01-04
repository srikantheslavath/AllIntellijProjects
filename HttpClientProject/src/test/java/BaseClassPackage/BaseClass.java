package BaseClassPackage;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class BaseClass {

    protected CloseableHttpClient client;
    protected CloseableHttpResponse response;
    protected static final String BASE_ENDPOINT ="https://api.github.com/";

    @BeforeMethod
    public void setUp(){
        client= HttpClientBuilder.create().build();
    }

//@BeforeMethod
    public void closeResources() throws IOException {
        client.close();
        response.close();
}



}
