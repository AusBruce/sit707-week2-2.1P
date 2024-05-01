//package sit707_week2;
//
//import java.io.File;
//
//import java.time.Duration;
//
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class testKmart {
//	public static void sleep(int sec) {
//		try {
//			Thread.sleep(sec*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void officeworks_registration_page(String url) {
//		// Step 1: Locate chrome driver folder in the local drive.
//		System.setProperty("webdriver.chrome.driver", "/Users/yuhengwang/Desktop/IT material/2024 T1/SIT707 software testing/chromedriver-mac-x64/chromedriver");
//		
//		// Step 2: Use above chrome driver to open up a chromium browser.
//		System.out.println("Fire up chrome browser.");
//		WebDriver driver = new ChromeDriver();
//		
//		System.out.println("Driver info: " + driver);
//		
//		sleep(2);
//	
//		// Load a webpage in chromium browser.
//		driver.get(url);
//		
//		
//
//		
//		
//		 //Identify button 'Create account' and click to submit using Selenium API.
//		 
//		// Write code
////		WebElement createAccountButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
////		createAccountButton.click();
//
//		/*
//		 * How to identify a HTML input field -
//		 * Step 1: Inspect the webpage, 
//		 * Step 2: locate the input field, 
//		 * Step 3: Find out how to identify it, by id/name/...
//		 */
//		
//		// Find first input field which is firstname
//		WebElement element = driver.findElement(By.id("first-name"));
//		System.out.println("Found element: " + element);
//		// Send first name
//		element.sendKeys("yuheng");
//		
//		/*
//		 * Find following input fields and populate with values
//		 */
//		// Write code
//		// find last name
//		WebElement element2 = driver.findElement(By.id("last-name"));
//		System.out.println("Found element: " + element2);
//		// Send last name
//		element2.sendKeys("wang");
//		
//		//find email
//		WebElement element4 = driver.findElement(By.id("signup-email"));
//		System.out.println("Found element: " + element4);
//		// Send email
//		element4.sendKeys("wangyuheng086@gmail.com");
//		//find password
//	
//		/*
//		 * Identify button 'Create account' and click to submit using Selenium API.
//		 */
//		// Write code
////		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"btn-signup\"]"));
////		createAccountButton.click();
//
//		/*
//		 * Take screenshot using selenium API.
//		 */
//		// Write code
//		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	        try {
//	            FileUtils.copyFile(screenshot, new File("/Users/yuhengwang/Desktop/IT material/2024 T1/SIT707 software testing/task2_1P/screenShot.png"));
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//		
//		// Sleep a while
//		sleep(2);
//		
//		// close chrome driver
//		driver.close();	
//	}
//
//}
