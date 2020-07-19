package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageObjects {

    public static final Target USER_BUTTON_LINK = Target.the("User menu button").locatedBy("#menuUserLink");
    public static final Target USER_NAME = Target.the("Username icon").locatedBy("//*[@id='menuUserLink']/span");
}
