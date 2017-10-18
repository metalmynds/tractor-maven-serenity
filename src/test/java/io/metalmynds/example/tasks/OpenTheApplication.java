package io.metalmynds.example.tasks;

import io.metalmynds.example.actions.Display;
import io.metalmynds.example.ui.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheApplication implements Task {

	MainPage mainPage;
	
	@Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        	Display.windowOn(mainPage)
        );
    }
			
	public static OpenTheApplication window() {
        return instrumented(OpenTheApplication.class);
    }
}