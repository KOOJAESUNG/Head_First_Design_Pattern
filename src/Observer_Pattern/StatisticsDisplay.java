package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    private List<Object> pastTemperature;

    StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        pastTemperature = new ArrayList<Object>();
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        pastTemperature.add(temperature);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


    @Override
    public void display() {
        Statistics st = new Statistics(pastTemperature);
        System.out.printf("평균/최고/최저 온도: %.2f/%.2f/%.2f\n\n",st.getMean(),st.getMinMax()[0],st.getMinMax()[1]);
    }
}
