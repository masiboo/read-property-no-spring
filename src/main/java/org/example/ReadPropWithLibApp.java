package org.example;

public class ReadPropWithLibApp {

    public static void main(String[] args) {

        System.out.printf(PropertyLoaderWithLib.getInstance().getProperty("app.name"));

    }
}
