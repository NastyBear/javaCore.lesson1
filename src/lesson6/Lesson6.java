package lesson6;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;

public class Lesson6 {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("api.weather.yandex.ru")
                .addPathSegment("v2")
                .addPathSegment("informers")
                .addQueryParameter("lat","59.56")
                .addQueryParameter("lon","30.18")
                .addQueryParameter("limit","5")
                .build();

        Request request = new Request.Builder()
                .addHeader("X-Yandex-API-Key","a6eaa128-562d-4498-83e7-ecd3cbaf8b2a")
                .url(url)
                .build();
        Response response = client.newCall(request).execute();

      String  jsonResponse = client.newCall(request).execute().body().string();
        System.out.println(jsonResponse);

        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);


        WeatherResponse example = mapper.readValue(jsonResponse, WeatherResponse.class);
        System.out.println(example);

    }


}
