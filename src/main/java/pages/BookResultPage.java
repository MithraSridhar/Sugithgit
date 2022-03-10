package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class BookResultPage extends ProjectSpecificWrappers {
	
	public BookResultPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("ToolsQA")) {
			reportStep("This is not Book Result Page", "Fail");
		}
	}
	
	public String getISBN(){
		String ISBN = getTextByXpath("//div[@id='ISBN-wrapper']//following-sibling::div/label");
		System.out.println(ISBN);
		return ISBN;
	}
	
	public String getTitle(){
		String Title = getTextByXpath("//div[@id='title-wrapper']//following-sibling::div/label");
		System.out.println(Title);
		return Title;
	}
	
	public String getSubTitle(){
		String subTitle = getTextByXpath("//div[@id='subtitle-wrapper']//following-sibling::div/label");
		System.out.println(subTitle);
		return subTitle;
	}
	
	public String getAuthor(){
		String Author = getTextByXpath("//div[@id='author-wrapper']//following-sibling::div/label");
		System.out.println(Author);
		return Author;
	}
	
	public String getPublisher(){
		String Publisher = getTextByXpath("//div[@id='publisher-wrapper']//following-sibling::div/label");
		System.out.println(Publisher);
		return Publisher;
	}
	
	public String getTotalPages(){
		String totalPages = getTextByXpath("//div[@id='pages-wrapper']//following-sibling::div/label");
		System.out.println(totalPages);
		return totalPages;
	}
	
	public String getDescription(){
		String Description = getTextByXpath("//div[@id='description-wrapper']//following-sibling::div/label");
		System.out.println(Description);
		return Description;
	}
	
	public String getWebsite(){
		String Website = getTextByXpath("//div[@id='website-wrapper']//following-sibling::div/label");
		System.out.println(Website);
		return Website;
	}
	
	public BooksPage clickBackToBookStore(){
		clickByXpath("//button[@id='addNewRecordButton']");
		return new BooksPage(driver,test);
		
	}
	
	public BookResultPage clickAddToYourCollection(){
		clickByXpath("//button[contains(text(),'Add To Your Collection')]");
		acceptAlert();
		return this;		
	}	
	
	public String getUserName(){
		String userName = getTextByXpath("//label[contains(text(),'User Name :')]//following-sibling::label");
		System.out.println(userName);
		return userName;
	}
	
	public LoginPage clickLogOut(){
	clickByXpath("//button[@id='submit']");
	return new LoginPage(driver, test); 
	}	

	
}
