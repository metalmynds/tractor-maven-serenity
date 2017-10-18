package io.metalmynds.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DrawerTargets {

    public static Target HOME_BUTTON = Target.the("home menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='0']"));
    public static Target WEB_BUTTON = Target.the("web menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='1']"));
    public static Target NATIVE_COMPONENTS_BUTTON = Target.the("native components menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='2']"));
    public static Target INPUT_CONTROLS_BUTTON = Target.the("input controls menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='3']"));
    public static Target NESTED_VIEWS_BUTTON = Target.the("nested views menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='4']"));
    public static Target CRASH_BUG_BUTTON = Target.the("crash/bug menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='5']"));
    public static Target ALERTS_BUTTON = Target.the("alerts menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='6']"));
    public static Target LOGIN_PAGE_BUTTON = Target.the("login page menu item").located(By.xpath("//android.support.v7.widget.RecyclerView[contains(@resource-id, 'com.amazonaws.devicefarm.android.referenceapp:id/drawerList')]/android.widget.FrameLayout[@index='6']"));

}

