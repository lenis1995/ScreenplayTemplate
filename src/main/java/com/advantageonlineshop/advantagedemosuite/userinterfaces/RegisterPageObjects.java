package com.advantageonlineshop.advantagedemosuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageObjects {

    public static final Target SIGN_UP_FORM = Target.the("SignUp form container").locatedBy("#formCover");
    public static final Target ALLOW_OFFERS_CHECKBOX = Target.the("Checkbox to allow offers").locatedBy(" [name='allowOffersPromotion']");
    public static final Target CONDITIONS_CHECKBOX = Target.the("Terms and conditions checkbox").locatedBy("[name='i_agree']");
    public static final Target REGISTER_BUTTON = Target.the("Register submit button").locatedBy("#register_btnundefined");
    //----------------------------------------------------------------------------------------------------------------------------------------------------
    // USER INFORMATION FIELD TARGETS
    public static final Target USER_USERNAME = Target.the("Username text field").locatedBy("[name='usernameRegisterPage']");
    public static final Target USER_EMAIL = Target.the("User email text field").locatedBy("[name='emailRegisterPage']");
    public static final Target USER_PASSWORD = Target.the("User password text field").locatedBy("[name='passwordRegisterPage']");
    public static final Target USER_CONFIRM_PASSWORD = Target.the("User password confirmation text field").locatedBy(" [name='confirm_passwordRegisterPage']");
    public static final Target USER_FIRST_NAME = Target.the("User name text field").locatedBy("[name='first_nameRegisterPage']");
    public static final Target USER_LAST_NAME = Target.the("User lastname text field").locatedBy("[name='last_nameRegisterPage']");
    public static final Target USER_PHONE_NUMBER = Target.the("User phone number").locatedBy("[name='phone_numberRegisterPage']");
    public static final Target USER_COUNTRY = Target.the("User country text field").locatedBy("//select[@name='countryListboxRegisterPage']");
    public static final Target USER_CITY = Target.the("User city text field").locatedBy("[name='cityRegisterPage']");
    public static final Target USER_ADDRESS = Target.the("User address text field").locatedBy("[name='addressRegisterPage']");
    public static final Target USER_DEPARTMENT = Target.the("User state/department/province text field").locatedBy("[name='state_/_province_/_regionRegisterPage']");
    public static final Target USER_POSTAL_CODE = Target.the("User postal code text field").locatedBy("[name='postal_codeRegisterPage']");
    public static final Target COUNTRY_OPTIONS = Target.the("Country Dropdown Options").locatedBy("//select[@name='countryListboxRegisterPage']//option");
}
