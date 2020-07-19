package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageObjects {

    public static final Target USER_NAME = Target.the("Username text field").locatedBy("[name='usernameRegisterPage']");
    public static final Target USER_EMAIL = Target.the("Username text field").locatedBy("[name='emailRegisterPage']");
    public static final Target USER_PASSWORD = Target.the("Username text field").locatedBy("[name='passwordRegisterPage']");
    public static final Target USER_CONFIRM_PASSWORD = Target.the("Username text field").locatedBy(" [name='confirm_passwordRegisterPage']");
    public static final Target ALLOW_OFFERS = Target.the("Username text field").locatedBy(" [name='allowOffersPromotion']");
    public static final Target CONDITIONS_CHECKBOX = Target.the("Username text field").locatedBy("[name='i_agree']");
    public static final Target REGISTER_BUTTON = Target.the("Username text field").locatedBy("#register_btnundefined");
}
