package Observer_Pattern;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);

        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
