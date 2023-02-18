package com.practica.web.task;

import com.practica.web.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.practica.web.ui.UIMenu.*;
import static com.practica.web.ui.UIRegistro.*;

public class RegistrarUsuario implements Task {

    private List<Usuario> usuario;

    public RegistrarUsuario(List<Usuario> usuario){
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REGISTRO),
                Enter.theValue(usuario.get(0).getUsuario()).into(TXT_USUARIO),
                Enter.theValue(usuario.get(0).getClave()).into(TXT_CLAVE),
                Click.on(BTN_CREAR)
                );
    }
    public static RegistrarUsuario enWeb(List<Usuario> usuario){
       return Tasks.instrumented(RegistrarUsuario.class, usuario);
    }
}
