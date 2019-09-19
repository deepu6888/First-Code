package org.se.action.task;import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\eclipse-workspace\\ActionTask\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.id("credit2"));
		WebElement dec = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement srcamt = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
		WebElement decamt = driver.findElement(By.id("amt7"));
		WebElement srccredit = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement deccredit = driver.findElement(By.id("amt8"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dec).perform();
		a.dragAndDrop(srcamt, decamt).perform();
		a.dragAndDrop(srccredit, deccredit).perform();
		

	}

}





//li[@id'credit2']
//li[@class='placeholder']