package org.example;

import java.io.IOException;

public class ReadProfWithLibApp {

    public static void main(String[] args) {

        System.out.printf(PropertyLoaderWithLib.getInstance().getProperty("app.name"));

    }
}
