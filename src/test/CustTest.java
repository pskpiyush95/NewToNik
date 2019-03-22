package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CustTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/CustomerRegist/CustomerDetails.html");

		Thread.sleep(3000);

		driver.findElement(By.name("t1")).sendKeys("Piyush Kataria");
		driver.findElement(By.name("t2")).sendKeys("piyush34@gmail.com");
		driver.findElement(By.name("t3")).sendKeys("987456321");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertEquals(3, 3);

	}

}