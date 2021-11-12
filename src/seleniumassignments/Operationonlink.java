package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operationonlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement wb=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
		
		boolean b=wb.isDisplayed();
		System.out.println(b);
		
		boolean c=wb.isEnabled();
		System.out.println(c);
		
         String a=wb.getText();
         System.out.println("link name is  "+a);
         wb.click();
         
         
         
	}

}
