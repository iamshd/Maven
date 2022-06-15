import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleProject {
	
	@Test
	public void application() {
		System.setProperty("webdriver.chrome.driver", "D:\\Local Disk E_10132018142\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
	  	 
	  	//Setting the driver to chrome driver
	  	  WebDriver dr = new ChromeDriver();
	  	  dr.manage().window().maximize();
	  	  dr.get("https://www.google.com");
	}

}
