package io.metalmynds.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainTargets {
    public static Target SYSTEM_BUTTON = Target.the("system menu").located(By.xpath("//android.widget.ImageButton[@content-desc=\"ReferenceApp\"]"));
}
