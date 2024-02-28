package Practice;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaskCardNumber {
    public static void main(String [] args){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\E008053\\Documents\\My_Work\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
       JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("arguments[0].value=arguments[1];","4111 1111 1111 1111","41111 **** **** ****");
    }
}