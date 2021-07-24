package withselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrontAutoDatoms {

	@Test //testNG annotation 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(LoginClass.url);
		driver.findElement(By.xpath(LoginClass.emailxpath))
		.sendKeys(LoginClass.emailkeys);
		driver.findElement(By.cssSelector(LoginClass.passxpath))
		.sendKeys(LoginClass.passleys);
		driver.findElement(By.cssSelector(LoginClass.loginxpath))
		.click();
	}

}