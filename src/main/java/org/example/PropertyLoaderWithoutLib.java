package org.example;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoaderWithoutLib {

    private static PropertyLoaderWithoutLib instance;
    private Properties props;


    private PropertyLoaderWithoutLib() {
        try (InputStream inputStream = ClassLoader.getSystemResourceAsStream("application.properties")) {
            props = new Properties();
            props.load(inputStream);
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }

        public static synchronized PropertyLoaderWithoutLib getInstance() {
            if (instance == null) {
                instance = new PropertyLoaderWithoutLib();
            }
            return instance;
        }

    public String getProperty(String key) {
        return getInstance().props.getProperty(key);
    }
}
