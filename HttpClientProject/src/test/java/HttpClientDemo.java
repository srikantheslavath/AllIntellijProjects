import jdk.swing.interop.SwingInterOpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class HttpClientDemo {

    @Test
    public void GetMethod() throws IOException {
        CloseableHttpClient httpcli = HttpClients.createDefault();
        HttpGet gett=new HttpGet("https://reqres.in/api/users?page=2");
        System.out.println("Request Type:"+gett.getMethod());
        HttpResponse res = httpcli.execute(gett);
        System.out.println(res);
        System.out.println(res.getProtocolVersion());
        System.out.println(res.getStatusLine().toString());
        System.out.println(res.getStatusLine().getStatusCode());
    }
}
