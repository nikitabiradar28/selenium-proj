package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		String t=driver.getTitle();
		
		System.out.println(t);
		
		String c=driver.getCurrentUrl();
		System.out.println(c);
		driver.close();
		
		

	}

}
