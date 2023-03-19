package com.tyba.tasks;

import com.tyba.utils.Replace;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tyba.models.AddProducts.AddProductsDataToPage.*;
import static com.tyba.ui.HomeDashboardLogin.*;
import static com.tyba.ui.ProductDescription.*;
import static com.tyba.utils.Replace.replaceColor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelecProductAPopularItemsTask implements Task {

    private String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(lblUser,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnPopulatItems),
                WaitUntil.the(titlePopulatItems,isVisible()).forNoMoreThan(10).seconds()
        );
        if (ProductoA().contains("NINGUNO")){
            System.out.println("No Contiene Datos");
        }
        else {

            actor.attemptsTo(Click.on(Replace.replaceProduct(optionProduct,ProductoA())),
                    WaitUntil.the(btnAddToCar,isVisible()).forNoMoreThan(10).seconds(),
                    Enter.theValue(CantidadA()).into(inputQuantity),
                    Click.on(replaceColor(ProductoA(),ColorA())),
                    MoveMouse.to(imgProduct),
                    Click.on(imgProduct),
                    Click.on(btnAddToCar),
                    WaitUntil.the(popUpAddToCart,isVisible()).forNoMoreThan(20).seconds()

            );

        }

        actor.attemptsTo(
                Click.on(lblHome),
                WaitUntil.the(lblUser,isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(popUpAddToCart,isNotVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnPopulatItems),
                WaitUntil.the(titlePopulatItems,isVisible()).forNoMoreThan(20).seconds()
        );

        if (ProductoB().contains("NINGUNO")){
            System.out.println("No Contiene Datos");
        }
        else {
            actor.attemptsTo(Click.on(Replace.replaceProduct(optionProduct,ProductoB())),
                    WaitUntil.the(btnAddToCar,isVisible()).forNoMoreThan(10).seconds(),
                    Enter.theValue(CantidadB()).into(inputQuantity),
                    Click.on(replaceColor(ProductoB(),ColorB())),
                    MoveMouse.to(imgProduct),
                    Click.on(imgProduct),
                    Click.on(btnAddToCar),
                    WaitUntil.the(popUpAddToCart,isVisible()).forNoMoreThan(20).seconds()
            );
        }

        actor.attemptsTo(
                Click.on(lblHome),
                WaitUntil.the(lblUser,isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(popUpAddToCart,isNotVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnPopulatItems),
                WaitUntil.the(titlePopulatItems,isVisible()).forNoMoreThan(20).seconds()
        );

        if (ProductoC().contains("NINGUNO")){
            System.out.println("No Contiene Datos");
        }
        else {
            actor.attemptsTo(Click.on(Replace.replaceProduct(optionProduct,ProductoC())),
                    WaitUntil.the(btnAddToCar,isVisible()).forNoMoreThan(10).seconds(),
                    Enter.theValue(CantidadC()).into(inputQuantity),
                    Click.on(replaceColor(ProductoC(),ColorC())),
                    MoveMouse.to(imgProduct),
                    Click.on(imgProduct),
                    Click.on(btnAddToCar),
                    WaitUntil.the(popUpAddToCart,isVisible()).forNoMoreThan(20).seconds()
            );
        }

        actor.attemptsTo(Click.on(btnMenuCar));

    }
    public  static SelecProductAPopularItemsTask SelecProdcutA(){
        return instrumented(SelecProductAPopularItemsTask.class);
    }

}
