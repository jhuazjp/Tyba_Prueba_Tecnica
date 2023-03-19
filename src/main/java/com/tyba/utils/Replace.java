package com.tyba.utils;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.tyba.ui.ProductDescription.*;

public class Replace {

    public static Target replace (String element,String option){
        By xpath = By.xpath((element.replace("'replace'",option)));
        Target target = Target.the(option).located(xpath);
        System.out.println(xpath);
        return target;
    }

    public static Target replaceColor(String option,String color){
        By xpath;
        Target target = null;

        switch (option){
            case "HP_ELITEPAD_1000_G2_TABLET":
                xpath = By.xpath((optionColorTablet.replace("'replace'",color)));
                target = Target.the(option).located(xpath);
                System.out.println(target);
                return target;
            case "HP_ELITEBOOK_FOLIO":
                xpath = By.xpath((optionColorFolio.replace("'replace'",color)));
                target = Target.the(option).located(xpath);
                System.out.println(target);
                return target;
            case "HP_ROAR_PLUS_WIRELESS_SPEAKER":
                xpath = By.xpath((optionColorSpeaker.replace("'replace'",color)));
                target = Target.the(option).located(xpath);
                System.out.println(target);
                return target;
        }

        return target;

    }



    public static Target replaceProduct (String element, String option){
        By xpath;
        Target target = null;

        switch (option){
            case "HP_ELITEPAD_1000_G2_TABLET":
                xpath = By.xpath((element.replace("'replace'","16")));
                target = Target.the(option).located(xpath);
                System.out.println(target);
                return target;
            case "HP_ELITEBOOK_FOLIO":
                xpath = By.xpath((element.replace("'replace'","10")));
                target = Target.the(option).located(xpath);
                System.out.println(target);
                return target;
            case "HP_ROAR_PLUS_WIRELESS_SPEAKER":
                xpath = By.xpath((element.replace("'replace'","21")));
                target = Target.the(option).located(xpath);
                System.out.println(target);
                return target;
        }

        return target;

    }

}
