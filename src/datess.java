

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\srbhkul\\software\\sel\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
          driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
		String month="September 2022";
		String day="11";
		Thread.sleep(5000);
         
		while(true) {
	   String text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]")).getText();	
		System.out.println(text);
	   if(text.equals(month)) {
		   driver.findElement(By.xpath("//div[@aria-label='Sun Sep "+day+" 2022']")).click();
		   break;
		}else {
			driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		}}
	}

}		
		
		
		
		//int cell = driver.findElements(By.xpath("(//div[@role='row'])[1]//div")).size();
		//int row = driver.findElements(By.xpath("(//div[@role='rowgroup'])[2]/div")).size();
		
		
		
		
		
		
//		for(int i=1;i<=row;i++) {
//			for(int j=1;i<=cell;j++) {
//	String date = driver.findElement(By.xpath("(((//div[@role='rowgroup'])[2]/div)["+i+"]/div)["+j+"])).getText();
//		if(date.equals(day)) {
//			driver.findElement(By.xpath("(((//div[@role='rowgroup'])[2]/div)["+i+"]/div)["+j+"]")).click();
//		}
			
			
//			}
//		}
//		
		
		
		
		
		

