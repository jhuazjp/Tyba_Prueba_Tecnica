package com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tyba.models.CreateUser.CreateUserDataToPage.*;
import static com.tyba.ui.CreateAccount.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InputDataCreateNewAccoutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(inputUsername, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(Username()).into(inputUsername),
                Enter.theValue(Email()).into(inputEmail),
                Enter.theValue(Password()).into(inputPass),
                Enter.theValue(Password()).into(inputConfirmPass)
        );

        actor.attemptsTo(Scroll.to(inputFirtsName).andAlignToTop(),
                Enter.theValue(FirtsName()).into(inputFirtsName),
                Enter.theValue(LastName()).into(inputLastName),
                Enter.theValue(PhoneNumber()).into(inputPhoneNumber)
                );

        actor.attemptsTo(Scroll.to(inputLastName).andAlignToTop(),
                SelectFromOptions.byVisibleText(Country()).from(selectCountry),
                Enter.theValue(City()).into(inputCity),
                Enter.theValue(Address()).into(inputAdress),
                Enter.theValue(State()).into(inputState),
                Enter.theValue(PostalCode()).into(inputPostalCode),
                Click.on(checkTermAndConditions),
                Click.on(btnRegistrer));




    }





    public static InputDataCreateNewAccoutTask inputDataCreateNewAccount(){
        return instrumented (InputDataCreateNewAccoutTask.class);
    }
}
