import junit.framework.Assert;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

import java.io.IOException;

public class PostMethod {
    @Test
    public void postmethod() throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://reqres.in/api/users");

        String json ="{\"name\":\"Srivastava\",\"job\":\"QA\"}";
        httpPost.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));

        System.out.println("request:"+httpPost.getMethod());
        HttpResponse response = httpclient.execute(httpPost);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getReasonPhrase());

        Assert.assertEquals(response.getStatusLine().getReasonPhrase(),"Created");
        Assert.assertEquals(response.getStatusLine().getStatusCode(),201);

    }
}
