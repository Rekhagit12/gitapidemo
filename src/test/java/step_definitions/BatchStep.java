package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchPage;
import utilities.Logger_Load;

public class BatchStep {


	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    
	
	BatchPage.getInstance().DashboardPageVerification();
	
	
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	   
	
	
		BatchPage.getInstance().clickbatch();
	
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
	  
	
		BatchPage.getInstance().verifyBatchURL();
	
	}
	
	
	@Given("Admin is on the dashboard page after Login")
	public void admin_is_on_the_dashboard_page_after_login() {
	    
	
	BatchPage.getInstance().DashboardPageVerification();
	
	
	}
	@When("Admin clicks  {string} from navigation bar")
	public void admin_clicks_from_navigation_bars(String string) {
		BatchPage.getInstance().clickbatch();
	
	}

	@Then("Admin should see the {string} heading  in the header")
	public void admin_should_see_the_heading_in_the_header(String PageHeading) {
	   

		BatchPage.getInstance().Managebatch_HeadingVerification(PageHeading);
	
	
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	   
		BatchPage.getInstance().checkadminPagination();
	
	}

	@Then("Admin should see data table on the Manage Batch Page with following column headers Batch Name, Batch Description, Batch Status,No. of classes,Program Name,Edit,Delete")
	public void admin_should_see_data_table_on_the_manage_batch_page_with_following_column_headers_batch_name_Batch_description_Batch_status_no_of_classes_program_name_edit_delete() {
		BatchPage.getInstance().Validate_BatchTableHeaders();
	
	}

	


	
		


	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	    
       //boolean bIsDelAllBtnEnabled;

	     //  boolean batchDelAllBtnEnabled;
		//bIsDelAllBtnEnabled = BatchPage.getInstance().batchDelAllBtnEnabled;
        
       
		BatchPage.getInstance().BatchPageDeleteAllButtonEnabled();
		
       
       
	//if(batchDelAllBtnEnabled)
			//Logger_Load.info("Batch Page Delete All Button is disabled !!");
		//else
			//Logger_Load.info("Batch Page Delete All Button is NOT disabled !!");
	
	
	
	
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) throws InterruptedException {
boolean bIsAddNewBatchBtnVisible;
		
		Thread.sleep(1000);
		bIsAddNewBatchBtnVisible = BatchPage.getInstance().IsAddNewBatchButtonVisible();
		
		if(bIsAddNewBatchBtnVisible)
			Logger_Load.info("Batch Page + A New Batch Button is Visible !!");
		else
			Logger_Load.info("Batch Page  + A New Batch Button is NOT Visible !!");
	}
	


	@Then("Admin should check Each row in the data table should have a checkbox Also check Each row in the data table should have a edit icon that is enabled and check Each row in the data table should have a delete icon that is enabled")
	public void admin_should_check_each_row_in_the_data_table_should_have_a_checkbox_also_check_each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled_and_check_each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	 
	
		BatchPage.getInstance().datarows();
	
	
	
	
	
	}


	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	  
		BatchPage.getInstance().clickbatch();
		BatchPage.getInstance().clickbatchbutton();
	
	}

	@Then("Admin get A new pop up with Batch details appears")
	public void admin_get_a_new_pop_up_with_batch_details_appears() throws InterruptedException {
		Thread.sleep(1000);
		 BatchPage.getInstance().popupdisplay();
	

	}

}	








	
	
	










