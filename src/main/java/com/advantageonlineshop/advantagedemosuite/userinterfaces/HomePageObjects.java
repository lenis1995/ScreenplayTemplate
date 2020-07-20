package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageObjects {

    public static final Target USER_BUTTON = Target.the("User menu button").located(By.id("menuUserLink"));
}
