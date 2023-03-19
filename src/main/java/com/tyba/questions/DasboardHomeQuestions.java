package com.tyba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.tyba.ui.HomeDashboardLogin.lblUser;

public class DasboardHomeQuestions {

    public static Question<String> NameUser(){
        return actor -> TextContent.of(lblUser).viewedBy(actor).asString().trim();
    }


}
