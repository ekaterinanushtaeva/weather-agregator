package test.utils;

import com.classes.YahooEntity;
import com.utils.api.JsonXmlParser;
import com.utils.impl.JsonXmlParserImpl;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

import static test.constants.JsonXmlParserTestConstants.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsonXmlParserImpl.class)
public class JsonXmlParserTest {

    @Autowired
    private JsonXmlParser jsonXmlParser;

    @Test
    public void jsonToYahooEntitySuccessTest() throws IOException {
        List<YahooEntity> yahooEntities = jsonXmlParser.jsonToYahooEntityList(IOUtils
                .toString(getClass()
                        .getClassLoader()
                        .getResourceAsStream(YAHOO_TEST_JSON_RESOURSE)));

        Assert.assertTrue(yahooEntities.size() == 10);
        Assert.assertTrue(yahooEntities.get(0).getText() != null);
        Assert.assertTrue(yahooEntities.get(0).getDay() != null);
        Assert.assertTrue(yahooEntities.get(0).getDate() != null);
    }
}
