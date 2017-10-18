package io.metalmynds.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;
import org.openqa.selenium.By;

@Subject("the welcome message")
public class TheWelcomeMessage implements Question<String> {
	
	@Override
    public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).getDriver().findElement(By.id("")).getText();
    }
	
	public static TheWelcomeMessage text() {
        return new TheWelcomeMessage();
    }
}
