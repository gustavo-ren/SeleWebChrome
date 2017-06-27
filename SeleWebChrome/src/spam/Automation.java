package spam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// Caminho caso o chromedriver nao esteja no path
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gustavo\\Downloads\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Tempo de espera
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("Game of Thrones");
		  searchBox.submit();
		  Thread.sleep(5000);  // Tempo de espera
		  driver.quit();

	}

}
