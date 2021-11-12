package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operationonradiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nikita/Downloads/radio.html");
		WebElement wb=driver.findElement(By.id("female"));
		
		boolean sl=wb.isSelected();
		System.out.println(sl);
		
		 boolean a= wb.isDisplayed();
		 System.out.println(a);
		 boolean b= wb.isEnabled();
		 System.out.println(b);
		 wb.click();
		 boolean sl1=wb.isSelected();
			System.out.println(sl1);
		 
		 WebElement wb1=driver.findElement(By.id("age1"));
		 boolean sl2=wb.isSelected();
			System.out.println(sl2);
		 boolean c= wb1.isDisplayed();
		 System.out.println(c);
		 boolean d= wb1.isEnabled();
		 System.out.println(d);
		 wb1.click();
		 boolean sl3=wb.isSelected();
			System.out.println(sl3);
		 

	}

}
