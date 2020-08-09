package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageObjects {

    public static final Target USER_BUTTON = Target.the("User menu button").located(By.id("menuUserLink"));
    public static final Target PAGE_LOADER = Target.the("The landing Page Loader").locatedBy(".PopUp div .loader");
}
