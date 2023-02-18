package com.practica.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIRegistro {

    public static final Target TXT_USUARIO = Target.the("campo usuario")
            .located(By.id("sign-username"));
    public static final Target TXT_CLAVE = Target.the("campo clave")
            .located(By.id("sign-password"));
    public static final Target BTN_CREAR = Target.the("boton crear")
            .located(By.xpath("//button[contains(text(),'Sign up')]"));
}
