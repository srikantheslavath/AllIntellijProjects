import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

public class GetMethod {
    @Test
    public void getmethod() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpDelete httpdelete = new HttpDelete("https://reqres.in/api/users/2");
        CloseableHttpResponse response = httpclient.execute(httpdelete);

        System.out.println("request type " +httpdelete.getMethod());
        System.out.println("response type " +response);
        System.out.println(response.getProtocolVersion());
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getReasonPhrase());

        Assert.assertEquals(response.getStatusLine().getStatusCode(), 204);
        Assert.assertEquals(response.getStatusLine().getReasonPhrase(),"No Content");


    }
}
