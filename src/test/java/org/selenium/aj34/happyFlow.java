package org.selenium.aj34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class happyFlow {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        System.out.println("Hello World");
        System.out.print("Apoorv");
        System.out.println("HELLO");
    }
}
