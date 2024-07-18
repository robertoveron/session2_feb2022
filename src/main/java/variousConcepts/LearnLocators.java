package variousConcepts;

import org.junit.After
import org.junit.Before;
import org.junit.Test;
import org.openga.selenium.WebDriver;
import org.openga.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;
	
	@Before
	public void init() {
	
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe")
		driver = new ChromDriver();
		driver.manage().window.maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://objectspy.space/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	
	
	}
	    driver.findElement(By.cssSelector("input#tool-2")).click;s fun");
		driver.findElement(By.css
	    //xpath
	    //absloute 
	    driver.findElement(BY.xpath()"html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("I hate absolute xpath");
		driver.findElement(BY.xpath("//input[@id='profession-1']")).click();
		driver.findElement(BY.xpath("//input[@name='profession'and @id='profession-0']")).click();
	   // driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
	    driver.findElement(By.xpath("//a[contains text(),'API Documentations']")).click();
	
	@Test
	public void locateElements() {
	
		
		driver.findElement(By.name("firstname")).sendkeys("Selenium")
	    //driver.findElement(By.linkText("OS-API Product FromtEnd")).click();
//		driver.navigate().back();
		//driver.findElement(By.parcialLinkText("link Test:")).click();
	    
		
		//file upload
	    //if tag is input use.sendkeys(path)
		//if tag is other than input use Robot
		driver.findElement(By.id("photo").sendKeys("C:\\Users\\carag\\feb2022 selenium\\seccion 2\\seccion 2.pptx");
		
	    //CSS
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendkeys("is fun']"))
		driver.findElement(BY.xpath("//a[text()='API profession']")).click();
		driver.findElement(BY.xpath("//a[contains(text(),'API profession')]")).click();
	}
	  
	@After
	public void tearDown() {
		driver.close();
	    driver.quit();
	}    
	
}
