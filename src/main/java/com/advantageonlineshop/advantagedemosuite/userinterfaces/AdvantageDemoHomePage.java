package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class AdvantageDemoHomePage extends PageObject {

    public static AdvantageDemoHomePage advantageDemoHomePage(){
        return new AdvantageDemoHomePage();
    }
}
