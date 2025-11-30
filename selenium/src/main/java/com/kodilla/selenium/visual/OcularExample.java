package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/selenium-drivers/Firefox/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        WebDriver webDriver = new FirefoxDriver(firefoxOptions);

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\Joanna\\Desktop\\Testowanie\\Kurs\\Projekt Java\\kodilla-selenium\\src\\main\\resources\\Ocular\\results"))
                .snapshotPath(Paths.get("C:\\Users\\Joanna\\Desktop\\Testowanie\\Kurs\\Projekt Java\\kodilla-selenium\\src\\main\\resources\\Ocular\\snapshots"))
                .globalSimilarity(95) // ustawia dokładność porównywania obrazów na 95%
                .saveSnapshot(true); // informuje Oculara, aby stworzył automatycznie punkt odniesienia, jeśli on nie istnieje.

        WorldTimePage page = new WorldTimePage(webDriver);
        page.open();
        page.compare();
        page.close();
    }
}