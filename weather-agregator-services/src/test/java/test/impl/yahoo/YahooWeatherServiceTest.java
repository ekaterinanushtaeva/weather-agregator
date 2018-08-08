package test.impl.yahoo;

import com.classes.Entity;
import com.impl.yahoo.YahooWeatherServiceImpl;
import com.utils.impl.JsonXmlParserImpl;
import com.utils.impl.RequestExecutorImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {YahooWeatherServiceImpl.class,
        RequestExecutorImpl.class,
        JsonXmlParserImpl.class})
public class YahooWeatherServiceTest {

    @Autowired
    private YahooWeatherServiceImpl yahooWeatherService;

    @Test
    public void getWeatherStringQuerySuccessTest() {
        List<Entity> weatherEntities = yahooWeatherService.getWeather("Moskva");

        Assert.assertEquals(weatherEntities.size(), 10);
        Assert.assertNotNull(weatherEntities.get(0).getDay());
    }

    @Test
    public void getWeatherLatLonQuerySuccessTest() {
        List<Entity> weatherEntities = yahooWeatherService.getWeather(54, 48);

        Assert.assertEquals(weatherEntities.size(), 10);
        Assert.assertNotNull(weatherEntities.get(0).getDay());
    }
}
