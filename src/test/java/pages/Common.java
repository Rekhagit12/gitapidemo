package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import app_hooks.AppHooks;
import utilities.Logger_Load;

public class Common {


	By programBtn = By.xpath("//button[@id='program']");
	By batchBtn = By.xpath("//button[@id='batch']");
	By LMSDashboardTitle = By.xpath("//span[normalize-space()='LMS - Learning Management System']");
	
	
	
	public void verifyDashboardPage()
	{
		boolean verifyDashboard =AppHooks.getInstance().getDriver().findElement(LMSDashboardTitle).isDisplayed();
		if(verifyDashboard)
			Logger_Load.info("Admin is on dashboard page after Login...");
		else
			Logger_Load.error("Admin is not on dashboard page after Login...");

		Assert.assertTrue(verifyDashboard);

	}

	/**To check Heading of the Page (Eg.Manage Program/Manage Batch/Manage User)
	 * 
	 * @param PageHeading (Pass Parameter eg.Manage Program)
	 */
	public void CheckPageHeading(String PageHeading)
	{
		boolean headingPresent =AppHooks.getInstance().getDriver().findElement(By.xpath("//div[normalize-space()='"+PageHeading+"']")).isDisplayed();
		Assert.assertTrue(headingPresent);

		if(headingPresent)
			Logger_Load.info(PageHeading +" is present as expected...");

		
		else
			Logger_Load.error(PageHeading +" is not present as expected...");

			
	}

	/**To check Pagination Message (Eg.Showing 1 to 5 of 54 entries)
	 * 
	 * @param PaginationElement (Pass the pagination web element  eg.PaginatorMessage)
	 * 	By paginatorMessage = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");

	 */
	
	public void checkPaginationMessage(By PaginationElement)
	{
		boolean PaginationMessageMatch=false;
		String PaginationMessage = AppHooks.getInstance().getDriver().findElement(PaginationElement).getText();
				
		String[] splitArr =PaginationMessage.split("of");
		String totEnt = (splitArr[1]);
	
		String[] splitArr2 = totEnt.split(" ");
		String TotalEntries = splitArr2[1];

		int intTotalEntries = Integer.parseInt(TotalEntries);

		
		if(intTotalEntries<10)
		{	
			PaginationMessageMatch = PaginationMessage.matches("Showing [0-9] to [0-9] of [0-9] entries");
		
		}
		else if (intTotalEntries>=10 && intTotalEntries<100)
		{
			PaginationMessageMatch = PaginationMessage.matches("Showing [0-9] to [0-9] of [0-9][0-9] entries");
		}
		else if (intTotalEntries>=100 && intTotalEntries<1000)
		{
			PaginationMessageMatch = PaginationMessage.matches("Showing [0-9] to [0-9] of [0-9][0-9][0-9] entries");
		}
		if(PaginationMessageMatch)
			Logger_Load.info("Pagination text is present as expected... "+PaginationMessage );
		else
			Logger_Load.error("Pagination text is not present as expected... "+PaginationMessage );

		Assert.assertTrue(PaginationMessageMatch);
		
	}

	
	
}