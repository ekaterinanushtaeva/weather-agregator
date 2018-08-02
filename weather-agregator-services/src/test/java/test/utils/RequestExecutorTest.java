package test.utils;

import com.utils.api.RequestExecutor;
import com.utils.impl.RequestExecutorImpl;
import org.assertj.core.util.Maps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RequestExecutorImpl.class)
public class RequestExecutorTest {

    @Autowired
    private RequestExecutor requestExecutor;

    @Test
    public void executeGetRequestSuccessTest() {

        String requestResult = requestExecutor.executeGetRequest(
                "https://query.yahooapis.com/v1/public/yql?format=json",
                Maps.newHashMap("Accept", "application/json"),
                Maps.newHashMap("q", "select * from weather.forecast where woeid in " +
                        "(select woeid from geo.places where text='Ульяновск')"));

        Assert.assertTrue(requestResult.contains("high"));
    }

    @Test
    public void executePostRequestSuccessTest() {

        requestExecutor.executePostRequest(
                "http://httpbin.org/post",
                Maps.newHashMap("Accept", "application/json"),
                new Object());
    }
}
