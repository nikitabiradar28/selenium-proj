package seleniumassignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Nikita/Downloads/dropDown.html");
		WebElement wb=driver.findElement(By.id("cars"));
		Select sel=new Select(wb);
		
		sel.selectByVisibleText("Honda");  //1st majorly used method
		
		// sel.selectByIndex(2);  //2nd method
		
		//sel.selectByValue("audi"); //3ed method
          WebElement wb1=sel.getFirstSelectedOption();
          String s=wb1.getText();
               System.out.println(s);
		
          List<WebElement> ls=sel.getOptions();
          int a= ls.size();
               System.out.println(a);
               
              // ArrayList al=new ArrayList();
               
               for(WebElement abc:ls)
            	   
               {
            	   String d=abc.getText();
            	   System.out.println(d);
            	  
            	   }
              
               

               
               

	}

	
		
	}


