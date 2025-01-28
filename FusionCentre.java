import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FusionCentre {

    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "C:/Users/1000074030/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        
        driver.get("https://document-versions-analyzers-demo.tensai.run/");
        Thread.sleep(3000);
        
        WebElement Username = driver.findElement(By.xpath("//input[@placeholder='User ID']"));
        Username.sendKeys("1000077777");
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys("Hexaware@123");
        WebElement Login =  driver.findElement(By.xpath("//button[@type=\"button\"]"));
        Login.click();  
        Thread.sleep(12000);
        
        WebElement NewComparison = driver.findElement(By.xpath("//span[text()='New Comparison']"));
        NewComparison.click();
        Thread.sleep(2000);
		WebElement BrowseFile1 = driver.findElement(By.xpath("//div[@class = 'ant-row css-mzwlov']//child::div[contains(@class, 'ant-col')][1]//child::input[@type = 'file']\r\n"
				+ " "));
		BrowseFile1.sendKeys("C:/Users/1000074030/Downloads/carlyle/Carlyle Test Data/Carlyle/Carlyle - 1.pptx");
		Thread.sleep(1000);
		WebElement BrowserFile2 = driver.findElement(By.xpath("//div[@class = 'ant-row css-mzwlov']//child::div[contains(@class, 'ant-col')][2]//child::input[@type = 'file']\r\n"
				+ " ")); 
		BrowserFile2.sendKeys("C:/Users/1000074030/Downloads/carlyle/Carlyle Test Data/Carlyle/Carlyle - 2.pptx");
		Thread.sleep(1000);
		WebElement UploadDocuments = driver.findElement(By.xpath("//button[@class='ant-btn css-mzwlov ant-btn-primary upload-btn']"));
		UploadDocuments.click();
		Thread.sleep(150000);
		
		WebElement ReviewChanges = driver.findElement(By.xpath("//span[text() = 'REVIEW CHANGES']"));
		ReviewChanges.click();
		Thread.sleep(1000);
		WebElement SaveReport = driver.findElement(By.xpath("//span[text() = 'SAVE REPORT']"));
		SaveReport.click();
		Thread.sleep(2000);
		WebElement DownloadReport = driver.findElement(By.xpath("//span[text() = 'DOWNLOAD REPORT']"));
		DownloadReport.click();
		Thread.sleep(2000);
		WebElement Close = driver.findElement(By.xpath("//span[@aria-label='close']"));
		Close.click();
		Thread.sleep(2000);
		
		WebElement GoBack = driver.findElement(By.xpath("//span[text()='GO BACK']"));
		GoBack.click();
		Thread.sleep(3000);
		
		WebElement ViewComparison = driver.findElement(By.xpath("//span[text() = 'View Comparison']"));
		ViewComparison.click();
		Thread.sleep(2000);
		WebElement BrowseFile = driver.findElement(By.xpath("//input[@type='file']"));
		BrowseFile.sendKeys("C:/Users/1000074030/Downloads/Carlyle - 1.pptx vs Carlyle - 2.pptx.json");
		Thread.sleep(1000);
		WebElement UploadDocument = driver.findElement(By.xpath("//span[text() = 'UPLOAD DOCUMENT']"));
		UploadDocument.click();
		Thread.sleep(50000);
		
		WebElement Goback = driver.findElement(By.xpath("//button[@class = 'ant-btn css-mzwlov ant-btn-primary go-back-btn']"));
		Goback.click();
		Thread.sleep(3000);
		
		WebElement View = driver.findElement(By.xpath("//button[@type='button'][1]")); 
		View.click();
		Thread.sleep(3000);
		WebElement review = driver.findElement(By.xpath("//button[@class = 'ant-btn css-mzwlov ant-btn-primary modify-report-btn']"));
		review.click();
		Thread.sleep(1000);
		WebElement close = driver.findElement(By.xpath("//span[@class = 'ant-modal-close-x']"));
		close.click();
		Thread.sleep(1000);
		
		WebElement goback = driver.findElement(By.xpath("//button[@class = 'ant-btn css-mzwlov ant-btn-primary go-back-btn']"));
		goback.click();
		Thread.sleep(3000);
		
		WebElement Delete = driver.findElement(By.xpath("//button[@class = 'ant-btn css-mzwlov ant-btn-default delete-btn']"));
		Delete.click();
		Thread.sleep(1000);
		WebElement delete = driver.findElement(By.xpath("//span[text() = 'OK']"));
		delete.click();
		Thread.sleep(2000);
		
		WebElement Logout = driver.findElement(By.xpath("//span[@class = 'ant-avatar-string']"));
		Logout.click();
		Thread.sleep(1500);
		WebElement logout = driver.findElement(By.xpath("//button[@class='ant-btn css-mzwlov ant-btn-default topbar-btn']"));
		logout.click();
		Thread.sleep(1000);
		
        }
}
    
        