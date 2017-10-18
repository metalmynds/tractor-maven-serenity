package io.metalmynds.example.actions;

import io.metalmynds.example.interactions.OpenWindow;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Display {

    public static OpenWindow windowOn(PageObject targetPage) {
        return instrumented(OpenWindow.class, targetPage);
    }

    public static Display windowOn() {
        return new Display();
    }

    public Interaction the(PageObject targetPage) {
        return instrumented(OpenWindow.class, targetPage);
    }

}
