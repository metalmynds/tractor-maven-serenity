package io.metalmynds.example.features.tasks;

import io.metalmynds.example.features.ui.LoginTargets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginToApplication implements Task {

	private final String userName;
	private final String password;

	protected LoginToApplication(String loginName, String password) {
		this.userName = loginName;
		this.password = password;
	}

	@Step("Login for #userName")
	public <T extends Actor> void performAs(T actor) {

		 actor.wasAbleTo(
			 Enter.theValue(userName).into(LoginTargets.USERNAME_FIELD),
			 Enter.theValue(password).into(LoginTargets.PASSWORD_FIELD),
			 Click.on(LoginTargets.LOGIN_BUTTON)
		 );

	}

	public static LoginToApplication usingCredentials(String userName, String password) {
		return instrumented(LoginToApplication.class, userName, password);
	}

}
