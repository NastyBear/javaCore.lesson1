package lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Fact fact;
    private Forecast forecast;

    public WeatherResponse withFact (Fact fact){
        this.fact=fact;
        return this;
    }
    public WeatherResponse withForecast(Forecast forecast){
        this.forecast=forecast;
        return this;
    }
    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "В Санкт-Петербурге" +
                " Дата " + forecast +
                ", Температура " + fact + " C";
    }
}
class Fact{
    private Integer temp;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Fact withTemp(Integer temp){
        this.temp=temp;
        return this;
    }
    public Fact(){}

    @Override
    public String toString() {
        return " " + temp ;
    }
}
class Forecast{
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date;

   public Forecast withDate(String date) {
        this.date = date;
        return this;
    }
    public Forecast(){}

    @Override
    public String toString() {
        return " " + date ;
    }
}