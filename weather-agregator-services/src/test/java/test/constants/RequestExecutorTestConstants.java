package test.constants;

public interface RequestExecutorTestConstants {

    String GET_URL = "https://query.yahooapis.com/v1/public/yql?format=json";
    String POST_URL = "http://httpbin.org/post";
    String ACCEPT_REQUEST_HEADER = "Accept";
    String Q_QUERY_PARAM = "q";
    String YQL_TEST_QUERY = "select * from weather.forecast where woeid in " +
            "(select woeid from geo.places where text='Ульяновск')";
    String TEST_STRING = "high";
}
