package com.tyba.tasks;

import com.tyba.models.AddProducts.AddProductsDataToPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tyba.models.AddProducts.AddProductsDataToPage.*;
import static com.tyba.ui.HomeUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(lblTablets, isVisible()).forNoMoreThan(25).seconds(),
                Click.on(btnMenu),
                Enter.theValue(UseName()).into(inputUserName),
                Enter.theValue(Password()).into(inputPassword),
                Click.on(btnSignIn));
    }

    public static LoginTask LogIn(){
        return instrumented(LoginTask.class);
    }
}
