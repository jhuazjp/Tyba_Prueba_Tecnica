package com.tyba.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDescription extends PageObject {

    public static final Target btnAddToCar = Target.the("Button Add To Car").located(By.xpath("//*[@name='save_to_cart']"));
    public static final Target inputQuantity = Target.the("input Quiantity ").located(By.xpath("//*[@name='quantity']"));

    public static final Target imgAdvantegeDemo = Target.the("Home ").located(By.xpath("//*[@class='logoDemo roboto-light ng-binding']"));
    public static final Target popUpAddToCart = Target.the("Pop Up Add To Car").located(By.xpath("//*[@id='toolTipCart']"));

    public static final Target lblHome = Target.the("Label Home").located(By.xpath("//*[@translate='HOME'] "));

    public static final Target btnMenuCar = Target.the("Button Menu AddToCar").located(By.xpath("//*[@id='menuCart'] "));

    public static String optionColorTablet = "(//*[@id='productProperties']//span[@title=''replace''])[1]";

    public static String optionColorFolio = "(//*[@id='productProperties']//span[@title=''replace''])[2]";

    public static String optionColorSpeaker = "(//*[@id='productProperties']//span[@title=''replace''])[2]";

    public static final Target imgProduct = Target.the("Button Menu AddToCar").located(By.xpath("//*[@id='product-section'] "));


}
