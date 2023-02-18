package com.practica.web.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@CucumberOptions(
        features = {"src/test/resources/features"}
        ,tags = "@NuevoUsuarioExitoso"
        ,glue = {"com.practica.web.stepsdefinitions"}
        ,snippets = CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}