

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePEakerDemo {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\srbhkul\\software\\sel\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://phptravels.net/");
	
	driver.findElement(By.xpath("//input[@id='checkin']")).click();
	String month="September 2022";
	String day="11";

	
	while(true) {
	String text=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
		System.out.println(text);
	if(text.equals(month)) {
			break;
		}else{
			driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]")).click();
		}	
}

	int row = driver.findElements(By.xpath("(//tbody)[1]//tr")).size();
	int cell = driver.findElements(By.xpath("(//tbody)[1]//tr[1]//td")).size();
	
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=cell;j++) {
			
			String Act = driver.findElement(By.xpath("((//tbody)[1]//tr["+i+"]//td)["+j+"]")).getText();
			if(day.equals(Act)) {
				driver.findElement(By.xpath("((//tbody)[1]//tr["+i+"]//td)["+j+"]")).click();
			}
		}
		
		
	}
	
	
	
}
}	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr//td[contains(text(),'15')]")).click(); 
	
	

