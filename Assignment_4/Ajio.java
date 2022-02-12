package week3.day2.Assignment_4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio 
{		
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(list.size()+" Brand of the products displayed in the page"+"\n\nThe list is \n");
		int s_no=1;
		for(WebElement brandList:list)
		{
			System.out.println(s_no+" -> "+brandList.getText());
			s_no++;
		}
		List<WebElement> list2=driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("\nThe bags name is \n");
		s_no=1;
		for(WebElement nameList:list2)
		{
			System.out.println(s_no+" -> "+nameList.getText());
			s_no++;
		}
	//	Thread.sleep(3000);
		driver.close();
	}

}
