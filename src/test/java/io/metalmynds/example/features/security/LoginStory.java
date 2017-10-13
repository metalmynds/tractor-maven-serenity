package io.metalmynds.example.features.security;

import io.metalmynds.example.features.questions.TheWelcomeMessage;
import io.metalmynds.example.features.tasks.LoginToApplication;
import io.metalmynds.example.features.tasks.OpenTheApplication;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(SerenityRunner.class)
public class LoginStory {

    Actor juliet = Actor.named("Juliet Bravo");

    @Managed(uniqueSession = true)
    public WebDriver herPhone;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void julietCanBrowseTheWeb() {
    	    	
    	juliet.can(BrowseTheWeb.with(herPhone));
    }

    @Test
    @Screenshots(forEachAction=true)
    public void login_should_work_when_given_valid_credentials() {
    	
        givenThat(juliet).wasAbleTo(OpenTheApplication.window());
    	
        when(juliet).attemptsTo(LoginToApplication.usingCredentials("Juliet.Bravo", "Password123!"));
        
        then(juliet).should(eventually(seeThat(TheWelcomeMessage.text(), containsString("Hello User: Juliet Bravo"))));
        
    }
    
//    @Test
//    public void login_should_work_not_when_given_invalid_credentials() {
////
//    }

}