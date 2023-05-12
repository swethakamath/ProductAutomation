package Product;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class LogonPage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
		System.out.println("product website");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://product.hicare.in:9999/");
		driver.findElement(By.className("access_link")).click();
		//Code for login
		WebElement mobile_no=driver.findElement(By.id("user_mobile"));
		mobile_no.sendKeys("8433544769");
		WebElement send_otp=driver.findElement(By.id("sendotp"));
        send_otp.click();
        WebElement user_otp=driver.findElement(By.id("user_otp"));
        user_otp.click();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter OTP");
        String otp=scan.nextLine();
        scan.close();
        WebElement otp_enter=driver.findElement((By.id("user_otp")));
        otp_enter.sendKeys(otp);
        Thread.sleep(2000);
        System.out.println("OTP entered successfully");
        driver.findElement(By.id("btn_login")).click();
        Thread.sleep(2000);
        //code for viewing booked orders
        WebElement user_account=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a"));
        user_account.click();
        WebElement Booked_Orders=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/div/ul/li[1]/a"));
        Booked_Orders.click();
        Thread.sleep(5000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,2000)", "");
        //code for subscribing HIcare
        WebElement Email_Newsletter = driver.findElement(By.id("email_newsletter"));
        Email_Newsletter.sendKeys("swetha.kamath@hicare.in");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,2000)", "");
        WebElement btn_go = driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[1]/div[4]/div/div[1]/div/button/i"));
        btn_go.click();
 	       
		        
	}

}
