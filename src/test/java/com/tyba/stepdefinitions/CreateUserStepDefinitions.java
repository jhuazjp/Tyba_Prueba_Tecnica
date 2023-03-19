package com.tyba.stepdefinitions;



import com.tyba.models.CreateUser.CreateUserDataToPage;
import com.tyba.models.CreateUser.CreateUserInjections;
import com.tyba.questions.CreateAccountQuestions;
import com.tyba.questions.DasboardHomeQuestions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static com.tyba.models.CreateUser.CreateUserDataToPage.Username;
import static com.tyba.tasks.CreateUserTask.goToCreateNewAccount;
import static com.tyba.tasks.InputDataCreateNewAccoutTask.inputDataCreateNewAccount;
import static com.tyba.ui.CreateAccount.*;
import static com.tyba.ui.HomeDashboardLogin.lblUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.core.IsEqual.equalTo;


public class CreateUserStepDefinitions {


    @Given("^el usuario se registra en el aplicativo$")
    public void elUsuarioIngresaAlAplicativo() {
        theActorInTheSpotlight().attemptsTo(goToCreateNewAccount());

    }

    @When("^el usuario ingresa sus datos$")
    public void elUsuarioIngresaSusDatos(List<CreateUserInjections> dataInjection) {
        CreateUserDataToPage.data(dataInjection.get(0));
        theActorInTheSpotlight().attemptsTo(inputDataCreateNewAccount());
    }

    @Then("^el usuario valida la creacion exitosa de su cuenta$")
    public void elUsuarioValidaLaCreacionExitosaDeSuCuenta(List<CreateUserInjections> dataInjection) {
        CreateUserDataToPage.data(dataInjection.get(0));
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(lblUser,isVisible()).forNoMoreThan(10).seconds());
        theActorInTheSpotlight().should(
                seeThat("Your NameUser", DasboardHomeQuestions.NameUser(), equalTo(Username()))
        );

    }

    @Then("^el usuario no puede registrarse en el aplicativo$")
    public void elUsuarioNoPuedeRegistrarseEnElAplicativo(List<CreateUserInjections> dataInjection) {
        CreateUserDataToPage.data(dataInjection.get(0));
        theActorInTheSpotlight().attemptsTo(Scroll.to(btnRegistrer).andAlignToBottom());
        theActorInTheSpotlight().should(
                seeThat("User Exist", CreateAccountQuestions.UserAlreadyExists(), equalTo("User name already exists"))
        );
    }


    @Then("^el usuario no puede continuar con el registro$")
    public void elUsuarioNoPuedeContinuarConElRegistro() {
        theActorInTheSpotlight().should(
                seeThat("User Exist", CreateAccountQuestions.BtnRegistrerUnable(), equalTo(true))
        );
    }

    @Then("^el usuario no puede continuar con el registro sin aceptar Terminos y condicones$")
    public void elUsuarioNoPuedeContinuarConElRegistroSinAceptarTerminosYCondicones() {
        theActorInTheSpotlight().attemptsTo(Click.on(checkTermAndConditions));
        theActorInTheSpotlight().should(
                seeThat("User Exist", CreateAccountQuestions.BtnRegistrerUnable(), equalTo(true))
        );
    }

    @And("^el usuario no desea recibir ofertas exclusivas$")
    public void elUsuarioNoDeseaRecibirOfertasExclusivas() {
        theActorInTheSpotlight().attemptsTo(Click.on(checkReciveOfferts));
    }
}
