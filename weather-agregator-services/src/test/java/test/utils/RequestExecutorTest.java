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

import javax.ws.rs.core.MediaType;

import static test.constants.RequestExecutorTestConstants.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RequestExecutorImpl.class)
public class RequestExecutorTest {

    @Autowired
    private RequestExecutor requestExecutor;

    @Test
    public void executeGetRequestSuccessTest() {

        String requestResult = requestExecutor.executeGetRequest(
                GET_URL,
                Maps.newHashMap(ACCEPT_REQUEST_HEADER, MediaType.APPLICATION_JSON),
                Maps.newHashMap(Q_QUERY_PARAM, YQL_TEST_QUERY));

        Assert.assertTrue(requestResult.contains(TEST_STRING));
    }

    @Test
    public void executePostRequestSuccessTest() {

        requestExecutor.executePostRequest(
                POST_URL,
                Maps.newHashMap(ACCEPT_REQUEST_HEADER, MediaType.APPLICATION_JSON),
                new Object());
    }
}
