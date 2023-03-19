package com.tyba.stepdefinitions;

import com.tyba.utils.URL;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;

public class CommonStepDefinitions {

    private final URL page = new URL();


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        aNewActor().attemptsTo(
                Open.browserOn(page)
        );
    }


}
