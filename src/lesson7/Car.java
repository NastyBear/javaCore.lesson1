package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    private String color;
    private String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }
    public Car(){}

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
