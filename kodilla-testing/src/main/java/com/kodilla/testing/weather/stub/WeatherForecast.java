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
        Collection<Double> valueList1 = temperatures.getTemperatures().values();
        double sum = 0;
        for (double tempValueList1 : valueList1) {
           sum += tempValueList1; }
           double  average = sum / valueList1.size();
        return average;

        }

    public double medianTemperature() {
        List<Double> valueList2 = (List<Double>) temperatures.getTemperatures().values();
        double median = 0;
        double value = 0;
        int x = 0;
        Collections.sort(valueList2);
        x = (valueList2.size()+1) / 2;
        median = valueList2.get(x-1);
        return median;
    }

        }



