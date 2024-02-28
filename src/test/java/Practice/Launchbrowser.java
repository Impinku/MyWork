package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Launchbrowser {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\E008053\\Documents\\My_Work\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        System.out.println("Browser launched");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Gainers']")).isDisplayed());
        System.out.println("page displayed");

        List<WebElement> companyname=driver.findElements(By.xpath("(//th[text()='Company']/following::td/a)"));
        System.out.println(companyname.size());
        TreeMap<String,String> map=new TreeMap<>();
        for(int i=1;i<=companyname.size(); ++i){
            String namecomp="(//th[text()='Company']/following::td/a)["+i+"]";
            String currentPrice="(//th[text()='Company']/following::td/a)["+i+"]/following::td[3]";
            map.put(driver.findElement(By.xpath(namecomp)).getText(),driver.findElement(By.xpath(currentPrice)).getText());
        if(i==8 || i==13){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 500)");
        }
        }
        System.out.println(map.size());
        for(Map.Entry entry:map.entrySet()){
            System.out.println("Key :"+entry.getKey()+" "+ "Value :"+entry.getValue());
        }

        //driver.quit();
    }
}
