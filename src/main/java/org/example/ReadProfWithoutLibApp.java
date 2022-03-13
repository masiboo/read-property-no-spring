package org.example;

public class ReadProfWithoutLibApp {

    public static void main(String[] args) {

        System.out.printf(PropertyLoaderWithoutLib.getInstance().getProperty("app.name"));

    }
}
