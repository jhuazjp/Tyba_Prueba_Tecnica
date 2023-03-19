package com.tyba.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeDashboardLogin extends PageObject {
    public static final Target lblTablets = Target.the("text Tablets").located(By.xpath(""));
    public static final Target lblUser = Target.the("Name User").located(By.xpath("//*[@class='hi-user containMiniTitle ng-binding']"));
    public static final Target btnPopulatItems = Target.the("Button Popular Items").located(By.xpath("//*[@class='nav-li-Links'][2]//*[@class='menu navLinks roboto-regular ng-scope']"));
    public static final Target titlePopulatItems = Target.the("Title text Popular Items").located(By.xpath("//*[@class='roboto-regular center ng-scope' and contains(text(),'POPULAR ITEMS')]"));
    public static final Target linkViewDeatilsTablet = Target.the("link View Deatils Tablet").located(By.xpath("//label[@id='details_16']"));
    public static final Target linkViewDeatilsFolio = Target.the("link View Deatils Folio").located(By.xpath("//label[@id='details_10']"));
    public static final Target linkViewDeatilsSpeaker = Target.the("link View Deatils Speaker").located(By.xpath("//label[@id='details_21']"));


    public static String optionProduct = "//label[@id='details_'replace'']";

}
