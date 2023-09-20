package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {
        //2- we need to open the file in java memory :FileInputStream
        FileInputStream file = null;
        try {
            file = new FileInputStream("configuration.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //3 load the property object using  fileInputStream object
        try {
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not fund in the configuration reader");
            throw new RuntimeException(e);
        }

    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}

