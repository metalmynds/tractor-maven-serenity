package io.metalmynds.example.features.tasks;

import io.metalmynds.example.features.actions.Display;
import io.metalmynds.example.features.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheApplication implements Task {

	LoginPage loginPage;
	
	@Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        	Display.windowOn(loginPage)
        );
    }
			
	public static OpenTheApplication window() {
        return instrumented(OpenTheApplication.class);
    }
}