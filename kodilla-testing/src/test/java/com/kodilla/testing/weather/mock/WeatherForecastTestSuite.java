package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void averageTemperatureTest() {
        //Given
        Map<String, Double> testMap1 = new HashMap<>();
        testMap1.put("Rzeszow", 25.5);
        testMap1.put("Krakow", 26.2);
        testMap1.put("Wroclaw", 24.8);
        testMap1.put("Warszawa", 25.2);
        testMap1.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(testMap1);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double testSum = 0;
        double expectedAverage = 0;
        for (Map.Entry<String, Double> tempEntry : testMap1.entrySet()) {
            testSum += tempEntry.getValue(); }
        expectedAverage = testSum / testMap1.size();
        double testAverage = weatherForecast.averageTemperature();
        //Then
        Assertions.assertEquals(expectedAverage, testAverage);
    }
    @Test
    void medianTemperatureTest() {
        //Given
        double tempValue = 0;
        double expectedMedian = 0;
        int y = 0;
        List<Double> testValues = new ArrayList<>();
        Map<String, Double> testMap2 = new HashMap<>();
        testMap2.put("Rzeszow", 25.5);
        testMap2.put("Krakow", 26.2);
        testMap2.put("Wroclaw", 24.8);
        testMap2.put("Warszawa", 25.2);
        testMap2.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(testMap2);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        for (Map.Entry<String, Double> tempMap2 : testMap2.entrySet()) {
            tempValue = tempMap2.getValue();
            testValues.add(tempValue); }
        Collections.sort(testValues);
        y = (testValues.size()+1) / 2;
        expectedMedian = testValues.get(y);
        double testMedian = weatherForecast.medianTemperature();
        //Then
        Assertions.assertEquals(expectedMedian, testMedian);

    }
}
