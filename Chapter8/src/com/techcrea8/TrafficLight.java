package com.techcrea8;

public enum TrafficLight {
//    Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
//    the duration of the light. Write a program to test the TrafficLight enum so that it displays the
//    enum constants and their durations.
    RED("stop"),
    GREEN("go"),
    YELLOW("ready");

    private final String duration;

    TrafficLight(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }
}
