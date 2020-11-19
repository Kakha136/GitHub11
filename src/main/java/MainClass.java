import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\besob\\IdeaProjects\\GitHub project\\Drivers\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://github.com/login");
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("boobeeka46@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("96Xpassword");
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/main/div/form/div[4]/input[12]"));
                button.submit();
    }
}
