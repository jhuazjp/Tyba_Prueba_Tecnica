package com.tyba.stepdefinitions;

import com.tyba.models.AddProducts.AddProductsDataInjections;
import com.tyba.models.AddProducts.AddProductsDataToPage;
import com.tyba.questions.AddtoCarQuestions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.tyba.tasks.LoginTask.LogIn;
import static com.tyba.tasks.SelecProductAPopularItemsTask.SelecProdcutA;
import static com.tyba.ui.ShoppingCar.lblProdcutName;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddProductsStepDefinitions {
    @Given("^el usuario ingresa al aplicativo$")
    public void elUsuarioIngresaAlAplicativo(List<AddProductsDataInjections> dataInjections) {
        AddProductsDataToPage.data(dataInjections.get(0));
        theActorInTheSpotlight().attemptsTo(LogIn());
    }

    @When("^el usuario seleciona los productos de preferencia$")
    public void elUsuarioSelecionaLosProductosDePreferencia(List<AddProductsDataInjections> dataInjections) {
       AddProductsDataToPage.data(dataInjections.get(0));
       theActorInTheSpotlight().attemptsTo(SelecProdcutA());
    }

    @Then("^el usuario valida que sus productos se agregaron correctamente$")
    public void elUsuarioValidaQueSusProductosSeAgregaronCorrectamente(List<AddProductsDataInjections> dataInjections) {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(lblProdcutName,isVisible()).forNoMoreThan(10).seconds());
        theActorInTheSpotlight().should(
                seeThat("Car Shopping is not Empty", AddtoCarQuestions.CarIsNotEmpty(),equalTo(true))
        );
    }

    @And("^el usuario elimina los productos$")
    public void elUsuarioEliminaLosProductos(List<AddProductsDataInjections> dataInjections) {
        
    }

    @Then("^el usuario valida que sus productos se quitaron correctamente$")
    public void elUsuarioValidaQueSusProductosSeQuitaronCorrectamente(List<AddProductsDataInjections> dataInjections) {
        
    }

    @And("^el usuario edita los productos de su preferencia$")
    public void elUsuarioEditaLosProductosDeSuPreferencia(List<AddProductsDataInjections> dataInjections) {
        
    }

    @Then("^el usuario valida que que se editaran los productos correctamente$")
    public void elUsuarioValidaQueQueSeEditaranLosProductosCorrectamente(List<AddProductsDataInjections> dataInjections) {

    }
}
