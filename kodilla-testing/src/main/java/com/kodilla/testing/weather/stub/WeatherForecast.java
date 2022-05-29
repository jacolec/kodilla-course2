package com.kodilla.testing.weather.stub;
import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }

    public double averageTemperature() {
        Map<String, Double> temperatureMap = new HashMap<>();
        double average = 0;
        double sum = 0;
        for (Map.Entry<String, Double> temperature1 :
                temperatures.getTemperatures().entrySet()) {
            temperatureMap.put(temperature1.getKey(), temperature1.getValue());
            sum += temperature1.getValue(); }
            average = sum / temperatureMap.size();
        return average;

        }

        public double medianTemperature() {
            Map<String, Double> temperature2Map = new HashMap<>();
            List<Double> valueList = new ArrayList<>();
        double median = 0;
        double value = 0;
        int x = 0;
            for (Map.Entry<String, Double> temperature2 :
                    temperatures.getTemperatures().entrySet()) {
                temperature2Map.put(temperature2.getKey(), temperature2.getValue());
                value = temperature2.getValue();
                valueList.add(value); }
            Collections.sort(valueList);
            x = (valueList.size()+1) / 2;
            median = valueList.get(x-1);
            return median;

            }

        }



