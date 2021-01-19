package com.advantageonlineshop.advantagedemosuite.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Highlighter {

    public static void highlightElement(WebDriver driver, WebElementFacade facade)
    {
        JavascriptExecutor javascript=(JavascriptExecutor)driver;
        javascript.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid black;');", facade);

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        javascript.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", facade);
    }
}
