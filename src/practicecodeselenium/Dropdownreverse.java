package practicecodeselenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdownreverse {

	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
		// driver.windows().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&campaign_id=973072070&extra_1=s%7Cc%7C231346576925%7Ce%7Cfacebook%20sign%20up%7C&placement&creative=231346576925&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006292691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-295862466660%26loc_physical_ms%3D9062113%26loc_interest_ms%3D%26feeditemid%3D19894516786%26param1%3D%26param2%3D&gclid=CjwKCAjw-sqKBhBjEiwAVaQ9a8t1PuWhS-B8bMghEUnm5R9UZB2vQh5KD5YnV1FkaP_GW5N7DJX6ghoCGoQQAvD_BwE");
			
			WebElement fn=driver.findElement(By.name("firstname"));
			fn.sendKeys("Nikita");
			String fntext=fn.getAttribute("name");
			System.out.println("first name is "+fntext);
			
			WebElement ln= driver.findElement(By.name("lastname"));
			ln.sendKeys("Biradar");
			String lntext=ln.getAttribute("name");
			System.out.println("last name is "+lntext);
			
			WebElement ei=driver.findElement(By.name("reg_email__"));
			ei.sendKeys("nikitabiradar2@gmail.com");
			String email=ei.getAttribute("name");
			System.out.println("email id is "+email);
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nikitabiradar2@gmail.com");
			
			driver.findElement(By.name("reg_passwd__")).sendKeys("abc@123");
			
			WebElement dp1=driver.findElement(By.name("birthday_day"));
			Select sel=new Select(dp1);
			sel.selectByVisibleText("2");
			
			
			WebElement dp2=driver.findElement(By.name("birthday_month"));
			Select sel2=new Select(dp2);
			sel2.selectByIndex(7);
			//count dropdown value , print dropdown, sort dp n then revere dp values
			List<WebElement> ls=sel2.getOptions();
			int dp2size=ls.size();
			System.out.println("size of birthday month drop down is "+dp2size);
			
			
			ArrayList al=new ArrayList();
			
			for(WebElement abc:ls)
			{
				String data=abc.getText();
				al.add(data);
			}
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			Collections.reverse(al);
			
			
			WebElement dp3=driver.findElement(By.name("birthday_year"));
			Select sel3=new Select(dp3);
			sel3.selectByValue("1994");
			
			WebElement rb=driver.findElement(By.name("sex"));
			rb.click();
			
			
			driver.findElement(By.name("websubmit")).click();
			
			

	}

		
			
		


}
