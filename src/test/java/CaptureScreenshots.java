//edited version

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.prada-beauty.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Page Screenshot
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\screenshots\\pradaHomePage.png");
		FileHandler.copy(src, dest);
		
	//	Thread.sleep(2000);
		System.out.println("Prada HomePage is Captured");
		
		//Particular section Screenshot
		
		WebElement section=driver.findElement(By.xpath("//*[@id=\"homepage\"]/div/div[4]/div/div/div[2]/div/div[2]"));
		File src1=section.getScreenshotAs(OutputType.FILE);
		File dest1=new File(".\\screenshots\\BestSellersscreenshot.png");
		FileHandler.copy(src1, dest1);
		System.out.println("Best Seller is Captured");
	//	Thread.sleep(2000);
		
		//Capute WebElement Screenshot
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[1]"));
		File src2=ele.getScreenshotAs(OutputType.FILE);
		File dest2=new File(".\\screenshots\\logo.png");
		FileHandler.copy(src2, dest2);
		System.out.println("Logo is Captured");
		
		
		driver.close();

	}

}
