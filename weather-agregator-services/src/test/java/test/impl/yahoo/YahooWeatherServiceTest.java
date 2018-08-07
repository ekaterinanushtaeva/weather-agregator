package test.impl.yahoo;

import com.impl.yahoo.YahooWeatherServiceImpl;
import com.utils.impl.JsonXmlParserImpl;
import com.utils.impl.RequestExecutorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {YahooWeatherServiceImpl.class,
        RequestExecutorImpl.class,
        JsonXmlParserImpl.class})
public class YahooWeatherServiceTest {

    @Autowired
    private YahooWeatherServiceImpl yahooWeatherService;

    @Test
    public void getWeatherStringQuerySuccessTest() {
        yahooWeatherService.getWeather("Moskva");
    }

    @Test
    public void getWeatherLatLonQuerySuccessTest() {
        yahooWeatherService.getWeather(54, 48);
    }
}
