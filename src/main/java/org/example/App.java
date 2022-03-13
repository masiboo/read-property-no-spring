package org.example;

public class App {

    public static void main(String[] args) {

        System.out.printf(PropertyLoader.getInstance().getProperty("app.name"));

    }
}
