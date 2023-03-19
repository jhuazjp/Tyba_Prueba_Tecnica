package com.tyba.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCar extends PageObject {

    public static final Target lblProdcutName = Target.the("Table Product Name").located(By.xpath("//*[@translate='PRODUCT_NAME']"));

    public static final Target tableProducts = Target.the("Table Products").located(By.xpath("//*[@class='fixedTableEdgeCompatibility'] "));

}
