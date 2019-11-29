package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.*;

//import io.appium.java_client.InteractsWithApps.*;

public class FirstAppium {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f=new File("src\\test\\java");;
		File fs=new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoPixel");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//dc.setCapability("udid", "emulator-5554");
		dc.setCapability("platformVersion", "10.0");		
	//	AndroidDriver<AndroidElement> ADriver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);	
		AppiumDriver<WebElement> ADriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		ADriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ADriver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		ADriver.findElement(By.id("android:id/button1")).click();
		//ADriver.		
		ADriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).click();
	}

}
