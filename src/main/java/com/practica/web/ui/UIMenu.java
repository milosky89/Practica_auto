package com.practica.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIMenu {

    public static final Target BTN_REGISTRO = Target.the("registro usuario")
            .located(By.id("signin2"));
    public static final Target BTN_AUTENTICARSE = Target.the("autenticarse")
            .located(By.id("login2"));
    public static final Target LBL_LOGO = Target.the("logo")
            .located(By.xpath("//a[@id='nava']"));

}
