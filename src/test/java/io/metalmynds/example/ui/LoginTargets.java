package io.metalmynds.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginTargets {
    public static Target USERNAME_FIELD = Target.the("username field").located(By.id(""));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.id(""));
    public static Target LOGIN_BUTTON = Target.the("login button").located(By.id("mvn clean"));
}
