package com.techcrea8;

import javax.xml.namespace.QName;

public class Learn {
    private String name;

    public Learn() {
        this("");
    }
    public Learn(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Learn learner = new Learn("k");

        System.out.println(learner);
        learner.setName("Local");
        System.out.println(learner);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s", name);
    }
}
