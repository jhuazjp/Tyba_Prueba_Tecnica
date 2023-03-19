package com.tyba.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.tyba.ui.CreateAccount.btnRegistrer;
import static com.tyba.ui.CreateAccount.lblAlreadyExist;

public class CreateAccountQuestions {

    public static Question<String> UserAlreadyExists(){
        return actor -> Text.of(lblAlreadyExist).viewedBy(actor).asString().trim();
    }

    public static Question<Boolean> BtnRegistrerUnable (){
        return actor -> btnRegistrer.resolveFor(actor).isDisabled();
    }
}
