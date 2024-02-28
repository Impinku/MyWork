package Practice;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchAndroidMobileApplication {
    public static AndroidDriver<MobileElement> driver;

    public static void swipe( int startX, int startY, int endX, int endY, int duration) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public static void main(String [] args) throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        // Set BrowserStack capabilities
        caps.setCapability("browserstack.user", "YOUR_USERNAME");
        caps.setCapability("browserstack.key", "YOUR_ACCESS_KEY");

        // Set device and app details
        caps.setCapability("device", "Google Pixel 5");
        caps.setCapability("os_version", "11.0");
        caps.setCapability("app", "bs://<app-id>");

        // Initialize Android driver
        driver=new AndroidDriver<MobileElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"),caps);


        LaunchAndroidMobileApplication ns=new LaunchAndroidMobileApplication();
        ns.swipe( 500, 1000, 500, 500, 1000);
    }
}
