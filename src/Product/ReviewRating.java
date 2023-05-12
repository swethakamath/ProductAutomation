package Product;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class ReviewRating {

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
        
        //Review and Rating for a product
        WebElement rating =driver.findElement((By.xpath("/html/body/div[1]/main/div[3]/div/ul/li[3]/a")));
        rating.click();
        WebElement Submit_Review_btn =driver.findElement((By.id("submit-review")));
        Submit_Review_btn.click();
        WebElement cust_name1 =driver.findElement((By.id("cust_name")));
        cust_name1.sendKeys("swetha");
        WebElement cust_city1 =driver.findElement((By.id("cust_city")));
        cust_city1.sendKeys("abu dhabi");
        WebElement txt_important =driver.findElement((By.id("cust_review")));
        txt_important.sendKeys("Best service");
        WebElement rating_Star =driver.findElement((By.xpath("/html/body/div[3]/div/div[2]/form/div[4]/div/span[4]")));
        rating_Star.click();
        WebElement customer_review =driver.findElement((By.id("cust_review")));
        customer_review.click();
        WebElement btn_review =driver.findElement((By.id("btnsavereview")));
        btn_review.click();

	}

}
