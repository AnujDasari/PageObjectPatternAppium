package com.appium.screen.flows;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.pages.LoginPage;
import com.appium.pages.PublishPage;
import com.appium.pages.WelcomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.IOException;

public class AndroidFlow extends CommonAppiumTest implements DeviceInterface {

    public AndroidFlow(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void login(LoginPage loginPage, String username, String password) throws IOException, InterruptedException {
        loginPage.enterUserAndPassword(username, password);
        loginPage.signIn();
    }

    public void waitForHomePage(WelcomePage welcomePage) {
        welcomePage.acceptToolTip();
    }

    public void moveToLogOutScreen() {
        swipeRightUntilLogOutScreen();
    }

    public void moveToLogOutScreen(WelcomePage welcomePage) {
        // TODO Auto-generated method stub
        moveToLogOutScreen();
    }

    public void writeContent(PublishPage publishPage) {
        publishPage.writeContentAndPost();
        publishPage.clickBackButton();
        publishPage.clickPublish();

    }

}
