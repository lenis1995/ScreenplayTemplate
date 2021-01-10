package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageObjects {

    public static final Target USER_BUTTON = Target.the("User menu button").located(By.id("menuUserLink"));
    public static final Target PAGE_LOADER = Target.the("The landing Page Loader").locatedBy("//body//div[@class='loader']//svg");
    public static final Target LOGIN_MODAL = Target.the("User Login Modal Component").locatedBy("//login-modal");
    public static final Target CREATE_NEW_ACCOUNT_BUTTON = Target.the("Create new account button").locatedBy(".create-new-account.ng-scope");
}
