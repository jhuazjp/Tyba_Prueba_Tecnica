package com.tyba.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccount extends PageObject {

    //Account Details
    public static final Target inputUsername = Target.the("Input UserName").located(By.xpath("//*[@name='usernameRegisterPage']"));
    public static final Target inputEmail = Target.the("Input Email").located(By.xpath("//*[@name='emailRegisterPage']"));
    public static final Target inputPass = Target.the("Input Pass").located(By.xpath("//*[@name='passwordRegisterPage']"));
    public static final Target inputConfirmPass = Target.the("Input Confirm Pass").located(By.xpath("//*[@name='confirm_passwordRegisterPage']"));
    //Personal Details
    public static final Target lblPesonalDetails = Target.the("Text Personal Details").located(By.xpath("//*[@class='ng-scope']//*[contains(text(),'PERSONAL DETAILS')]"));
    public static final Target inputFirtsName = Target.the("Input First Name").located(By.xpath("//*[@name='first_nameRegisterPage']"));
    public static final Target inputLastName = Target.the("Input Last Name").located(By.xpath("//*[@name='last_nameRegisterPage']"));
    public static final Target inputPhoneNumber = Target.the("Input Phone Number").located(By.xpath("//*[@name='phone_numberRegisterPage']"));
    //Adress
    public static final Target lblAdress = Target.the("Text Adress").located(By.xpath("//*[@class='ng-scope']//*[contains(text(),'ADDRESS')]"));
    public static final Target selectCountry = Target.the("Select Country").located(By.xpath("//*[@name='countryListboxRegisterPage']"));
    public static final Target inputCity = Target.the("Input City").located(By.xpath("//*[@name='cityRegisterPage']"));
    public static final Target inputAdress = Target.the("Input Adress").located(By.xpath("//*[@name='addressRegisterPage']"));
    public static final Target inputState = Target.the("Input State").located(By.xpath("//*[@name='state_/_province_/_regionRegisterPage']"));
    public static final Target inputPostalCode = Target.the("Input Postal Code").located(By.xpath("//*[@name='postal_codeRegisterPage']"));

    public static final Target checkReciveOfferts = Target.the("Check Recibe Offerts").located(By.xpath("allowOffersPromotion"));
    public static final Target checkTermAndConditions = Target.the("Check Terms And Conditions").located(By.xpath("//*[@name='i_agree']"));
    public static final Target btnRegistrer = Target.the("Button Registrer").located(By.xpath("//*[@id='register_btnundefined']"));
    public static final Target lblAlreadyExist = Target.the("Usuario Existente").located(By.xpath("//label[@class='invalid center block smollMargin']"));



}
