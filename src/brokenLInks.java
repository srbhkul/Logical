

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLInks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\srbhkul\\software\\sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 int count =0;
		List<WebElement> Links = driver.findElements(By.tagName("a"));
             System.out.println(Links.size());
             for(int i =0;i<Links.size();i++) {
            WebElement element =Links.get(i);
            String url=element.getAttribute("href");
            
            URL link =new URL(url);
            HttpURLConnection httpCon=(HttpURLConnection) link.openConnection();
           
            httpCon.connect();
            
            int resCode = httpCon.getResponseCode();
            if(resCode>=400	) {
            	System.out.println(url + " "+"is Broken links");
            	count++;
            }
            else {
            	System.out.println(url+" "+" is valid links" );
            }
            
            
             }System.out.println(count);
           
	}

}
