package com.practica.web.task;

import com.practica.web.ui.UIPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class AbreWeb implements Task {

    private UIPagina paginaProductStore;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaProductStore)
        );
    }

    public static AbreWeb productStore(){
        return Tasks.instrumented(AbreWeb.class);
    }
}
