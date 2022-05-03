

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WaitStudy.implicitWait;

public class tabs {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\srbhkul\\software\\sel\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

	  WebElement policy = driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[3]"));
	  
	  List<WebElement> s = policy.findElements(By.tagName("a"));
	  int tabSize = s.size();
	  for(int i=0;i<tabSize;i++) {
		 s.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);	
		 Thread.sleep(2000);
	  } 
	  Set<String> windowsID = driver.getWindowHandles();
	  
        Iterator<String> it = windowsID.iterator();
        Actions act=new Actions(driver) ;
        for(int i=0; i<7;i++) {
        	String tab = it.next();
        	String sk=driver.switchTo().window(tab).getTitle();
        	if(sk.equals("Return Policy - Flipkart.com")) {
        		driver.switchTo().window(tab);
        		WebElement text = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div/p[1]"));
             
        act.moveToElement(text).doubleClick().click().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
         Thread.sleep(10000);
        	 
        		 }
        	
        }
        Thread.sleep(1000);
        Iterator<String> it1 = windowsID.iterator();
        for(int i=0; i<7;i++) {
        	String tab= it1.next();
        	String sk=driver.switchTo().window(tab).getTitle();
        if(sk.equals("Ewaste Compliance Tnc Store Online - Buy Ewaste Compliance Tnc Online at Best Price in India | Flipkart.com")) {
  			 driver.switchTo().window(tab);
  			 
  				WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
  				act.moveToElement(input).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); 
       	}
        }
      
	
	
	
}
}
