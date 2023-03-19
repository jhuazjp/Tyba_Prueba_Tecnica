package com.tyba.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tyba.ui.HomeUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CreateUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(lblTablets, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnMenu),
                Click.on(btnCreateUser));

    }

    public static CreateUserTask goToCreateNewAccount(){
        return instrumented (CreateUserTask.class);
    }
}
