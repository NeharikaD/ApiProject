package org.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties properties;
    static FileInputStream fis;
    public  static  Properties loadAllTheProperties() {
        properties = new Properties();
        try{
            fis = new FileInputStream("C:\\Users\\Neharika\\IdeaProjects\\FWUIAPIProjects\\target\\allTheProperties.properties");
            properties.load(fis);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        return properties;
    }

}
