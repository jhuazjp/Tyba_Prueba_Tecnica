package com.tyba.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomeUserInterface extends PageObject {

    public static final Target lblTablets = Target.the("Texto Tablets").located(By.xpath("//*[@id='tabletsTxt']"));
    public static final Target btnMenu = Target.the("Button Login").located(By.xpath("//*[@id='menuUser']"));
    public static final Target btnCreateUser = Target.the("Button New Account").located(By.xpath("//*[@class='create-new-account ng-scope']"));
    public static final Target inputUserName = Target.the("Input UserName").located(By.xpath("//*[@name='username']"));
    public static final Target inputPassword = Target.the("Input Password").located(By.xpath("//*[@name='password']"));
    public static final Target btnSignIn = Target.the("Button SigIn").located(By.xpath("//*[@id='sign_in_btnundefined']"));



}
