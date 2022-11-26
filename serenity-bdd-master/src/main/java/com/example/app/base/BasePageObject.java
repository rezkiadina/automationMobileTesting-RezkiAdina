package com.example.app.base;

//import com.example.app.drivers.AndroidDriverInit;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.PointOption;
//import org.openqa.selenium.By;
//
//import java.time.Duration;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import static com.example.app.drivers.AndroidDriverInit.driver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
public class BasePageObject {
  TouchAction touchList;

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }
  public TouchAction getTouchAction() {
    touchList = new TouchAction(getDriver());
    return touchList;
  }
  public List<AndroidElement> findElementsList(By locatorName) {
    return getDriver().findElements(locatorName);
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }
  public void longPressList(AndroidElement elementToPressList) {
    getTouchAction().longPress(PointOption.point(elementToPressList.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
            .release()
            .perform();
  }
  public void multipleTapsList(AndroidElement elementToMultipleTap){
    getTouchAction().tap(TapOptions.tapOptions().withTapsCount(5)
                    .withElement(ElementOption.element(elementToMultipleTap)))
            .perform();
  }

}
