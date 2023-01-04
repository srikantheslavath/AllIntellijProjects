package com.BasePagePackage;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    WebDriver driver;
    Properties prop;

    public BaseClass(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(("C:\\Users\\Sampath Velupula\\IdeaProjects\\MyFirstCRMFramework\\" +
                    "src\\main\\java\\com\\ConfigPropertiesFile\\Config.Properties"));
            prop.load(ip);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
