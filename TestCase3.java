package week2.day1.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Royal Enfield");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tom");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("cruise");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tom");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Holland");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/4/90");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Regional Manager");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000000");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Manufacturing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5012");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("RYEN");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Royal Enfield is an Indian multinational motorcycle manufacturing company headquartered in Chennai, Tamil Nadu, India.");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("From 1896 to 1897 known as \"The New Enfield Cycle Company Limited\"");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("088794 94527");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("David");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("David.Enfield@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.royalenfield.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Katrena");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Minoli");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("21, Kottur");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("65, Adyar");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600020");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600001");
	    driver.findElement(By.className("smallSubmit")).click();
	}

}
