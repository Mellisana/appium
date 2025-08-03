package ru.netology.pages;

import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainScreenAppium {
    @AndroidFindBy(id = "ru.netology.testing.uiautomator:id/buttonChange")
    public MobileElement buttonChange;

    @AndroidFindBy(id = "ru.netology.testing.uiautomator:id/textToBeChanged")
    public MobileElement textChangedResult;

    @AndroidFindBy(id = "ru.netology.testing.uiautomator:id/userInput")
    public MobileElement userInput;

    @AndroidFindBy(id = "ru.netology.testing.uiautomator:id/buttonActivity")
    public MobileElement openTextInActivity;

    @AndroidFindBy(id = "ru.netology.testing.uiautomator:id/text")
    public MobileElement expectedText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.TextView")
    public  MobileElement activityText;
    private AppiumDriver driver;

    public MainScreenAppium(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
    }

}