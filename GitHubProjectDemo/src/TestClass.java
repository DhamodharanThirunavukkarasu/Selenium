import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Software\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();


	}

}
