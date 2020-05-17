import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/hmnth/Downloads/chromedriver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement DropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        DropDownMenu.click();

        WebElement AutoCOmplete = driver.findElement(By.id("autocomplete"));
        AutoCOmplete.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
