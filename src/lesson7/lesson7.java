package lesson7;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class lesson7 {

    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Car car = new Car("red","WV");
//        objectMapper.writeValue(new File("car.json"),car);

//        ObjectMapper objectMapper1 = new ObjectMapper();
//        Car car1 = objectMapper1.readValue(new File("car.json"),Car.class);
//        System.out.println(car1.toString());

        String jsonString = "{\"color\":\"red\", \"type\":\"BMW\",\"year\":\"1970\"},";
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(jsonString, Car.class);
        System.out.println(car);

    }
}
