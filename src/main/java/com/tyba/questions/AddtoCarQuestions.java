package com.tyba.questions;

import net.serenitybdd.screenplay.Question;

import static com.tyba.ui.CreateAccount.btnRegistrer;
import static com.tyba.ui.ShoppingCar.tableProducts;

public class AddtoCarQuestions {

    public static Question<Boolean> CarIsNotEmpty (){
        return actor -> tableProducts.resolveFor(actor).isVisible();
    }
}
