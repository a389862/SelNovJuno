package testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseClass {
	public static ChromeDriver driver;
	
	public String excelFileName;
	
	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();

	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
				
		return ReadExcel.excelData(excelFileName);

	}

}
