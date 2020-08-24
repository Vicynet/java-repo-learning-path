package com.techcrea8;

public class TrafficLightTest {
    public static void main(String[] args) {

        System.out.println("Traffic Light and Duration:");

        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.printf("%-12s%s%n", trafficLight, trafficLight.getDuration());
        }
    }
}
