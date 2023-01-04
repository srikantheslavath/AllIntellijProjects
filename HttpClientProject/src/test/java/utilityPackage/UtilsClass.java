package utilityPackage;

import BaseClassPackage.BaseClass;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.Arrays;
import java.util.List;

public class UtilsClass extends BaseClass {

public static String getHeaders(CloseableHttpResponse response, String headerName){


        //Get All Headers
        Header[] headers = response.getAllHeaders();
        List<Header> httpHeaders = Arrays.asList(headers);
        String returnHeader = "";

        //Loop over the headers list
        for (Header header : httpHeaders) {
            if (headerName.equalsIgnoreCase(header.getName())) {
                returnHeader = header.getValue();
            }

            //if no header found throw the exception

            if (returnHeader.isEmpty()) {
                throw new RuntimeException("didnt find the header:" + headerName);

            }
        }
        return returnHeader;
    }
}

