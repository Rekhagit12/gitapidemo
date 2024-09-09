package step_definitions;




	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pages.AddPage;
	import pages.EditPage;

	public class EditStep {
//sec1
		@Given("Check edit icon on row level in data table is enabled")
		public void check_edit_icon_on_row_level_in_data_table_is_enabled() {
		   
			 EditPage.getInstance().rowleveledit();
		
		
		
		}

		@When("Admin clicks the edit icon")
		public void admin_clicks_the_edit_icon() {
		   
			 EditPage.getInstance().clickeditpencil();
		
		
		}

		@Then("A new pop up with Batch details appears")
		public void a_new_pop_up_with_batch_details_appears() {
		   
		
		
			 EditPage.getInstance().deatilsappers();
		
		
		
		
		}


	//sec2
		@When("Update the fields with valid and click save")
		public void update_the_fields_with_valid_and_click_save() throws InterruptedException {
		
			    EditPage.getInstance().updatefields();



		
		
		
		}

		 
	//sec3
	@When("Update the fields with invalid values and click save")
	public void update_the_fields_with_invalid_values_and_click_save() throws InterruptedException {
	       

		 EditPage.getInstance().m1();
			
		



	}

	@Then("Error message should display in the invalid fields")
	public void error_message_should_display_in_the_invalid_fields() throws InterruptedException {
	   


		EditPage.getInstance().m2();







	}

	//sce4
	@When("Erase data from mandatory field")
	public void erase_data_from_mandatory_field() throws InterruptedException {
	  
		EditPage.getInstance().mantatoryfield();
	
	
	}

	@Then("Error message should appear in the mandatory field")
	public void error_message_should_appear_in_the_mandatory_field() {
	   
	
	
	
	
	
	}

	
	
	
	
	
	
	
//sce5
	@When("Erase data from description field")
	public void erase_data_from_description_field() throws InterruptedException {
	    
	
		EditPage.getInstance().erasedescrip();
		
	
	
	
	
	
	}

	
	@Then ("updated batch details should appear on the data table")
	
	public void updated_batch_details_should_on_the_data_table() throws InterruptedException
	{
		
		
		EditPage.getInstance().updatemsg();
		
		
		
	
	
	
	
	
	}
	
	}


