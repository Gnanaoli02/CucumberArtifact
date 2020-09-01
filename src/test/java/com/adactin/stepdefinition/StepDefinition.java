package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReader;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		System.out.println("Application launched successfully");
	}

	@When("^user log into the application$")
	public void user_log_into_the_application() throws Throwable {
		System.out.println("Logged in successfully");
	}


	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		String url = FileReader.getInstance().getCrInstance().getUrl();
		getUrl(url);
	}

	/*
	 * @When("^user enters the valid \"([^\"]*)\" in username field$") public void
	 * user_enters_the_valid_in_username_field(String username) throws Throwable {
	 * // LoginPage lp =new LoginPage(driver);
	 * inputValuestoElement(pom.getlp().getUserName(), "gnanaolifriends"); }
	 * 
	 * @When("^user enters the valid \"([^\"]*)\" in password field$") public void
	 * user_enters_the_valid_in_password_field(String password) throws Throwable {
	 * inputValuestoElement(pom.getlp().getPassword(), "pavithran05"); }
	 */

	@When("^user enters the valid username in username field$")
	public void user_enters_the_valid_username_in_username_field() throws Throwable {
		inputValuestoElement(pom.getlp().getUserName(), "SreeDeviRaman");
	}

	@When("^user enters the valid password in password field$")
	public void user_enters_the_valid_password_in_password_field() throws Throwable {
		inputValuestoElement(pom.getlp().getPassword(), "Sree@123");
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		clickOnElement(pom.getlp().getLoginBtn());
	}

	@Then("^user verify the home page navigates to the search hotel page$")
	public void user_verify_the_home_page_navigates_to_the_search_hotel_page() throws Throwable {
		//Assert.assertEquals("A", "a");
	}

	@When("^user selects the location in the location field$")
	public void user_selects_the_location_in_the_location_field() throws Throwable {
		selectDropDown(pom.getsh().getLocation(),"Sydney","value");
	}

	@When("^user selects the hotel in select hotel field$")
	public void user_selects_the_hotel_in_select_hotel_field() throws Throwable {
		selectDropDown(pom.getsh().getHotel(), "Hotel Creek", "visibletext");
	}

	@When("^user selects the room type in select room type field$")
	public void user_selects_the_room_type_in_select_room_type_field() throws Throwable {
		selectDropDown(pom.getsh().getRoom(), "Standard", "value");
	}

	@When("^user selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable {
		// SearchHotel sh = new SearchHotelPage(driver);
		selectDropDown(pom.getsh().getNumbrooms(), "1", "value");
	}

	@When("^user selects the checkin date$")
	public void user_selects_the_checkin_date() throws Throwable {
		//SearchHotel sh = new SearchHotelPage(driver);
		inputValuestoElement(pom.getsh().getIn(),"30/08/2020");
	}

	@When("^user selects the checkout date$")
	public void user_selects_the_checkout_date() throws Throwable {
		inputValuestoElement(pom.getsh().getOut(),"31/08/2020");
	}

	@When("^user selects the adults per room$")
	public void user_selects_the_adults_per_room() throws Throwable {
		selectDropDown(pom.getsh().getAdult(), "2", "value");
	}

	@When("^user selects the children per room$")
	public void user_selects_the_children_per_room() throws Throwable {
		selectDropDown(pom.getsh().getAdult(),"2","value");
	}

	@When("^user clicks on search button to search the details$")
	public void user_clicks_on_search_button_to_search_the_details() throws Throwable {
		clickOnElement(pom.getsh().getSearchBtn());
	}

	@Then("^user verify the search hotel page to booking page$")
	public void user_verify_the_search_hotel_page_to_booking_page() throws Throwable {

	}

	@When("^user clicks on the selected radio button$")
	public void user_clicks_on_the_selected_radio_button() throws Throwable {
		clickOnElement(pom.getbp().getRadio());
	}

	@When("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		clickOnElement(pom.getbp().getContinue());

	}

	@Then("^user verify the booking page navigates to hotel confirmation page$")
	public void user_verify_the_booking_page_navigates_to_hotel_confirmation_page() throws Throwable {

	}

	@When("^user enter Firstname$")
	public void user_enter_Firstname() throws Throwable {
		inputValuestoElement(pom.getcp().getFirstname(), "SreeDevi");
	}

	@When("^user enter Lastname$")
	public void user_enter_Lastname() throws Throwable {
		inputValuestoElement(pom.getcp().getLastname(), "Raman");
	}

	@When("^user enter Address$")
		public void user_enter_Address() throws Throwable {
		inputValuestoElement(pom.getcp().getAddress(),"sydney Cross");
	}

	@When("^user enter Cardno$")
	public void user_enter_Cardno() throws Throwable {
		inputValuestoElement(pom.getcp().getCardno(), "1234567898999071");
	}

	@When("^user enter Cardtype$")
	public void user_enter_Cardtype() throws Throwable {
		selectDropDown(pom.getcp().getCardtype(),"VISA","value");
	}

	@When("^user enter Expirymonth$")
	public void user_enter_Expirymonth() throws Throwable {
		selectDropDown(pom.getcp().getExpirymonth(),"6", "value");
	}

	@When("^user enter Expiryyear$")
	public void user_enter_Expiryyear() throws Throwable {
		selectDropDown(pom.getcp().getExpiryyear(), "2022","value");
	}

	@When("^user enter Cvvnumber$")
	public void user_enter_Cvvnumber() throws Throwable {
		inputValuestoElement(pom.getcp().getCvvnumber(),"137");
	}

	@When("^user enter Booknow$")
	public void user_enter_Booknow() throws Throwable {
		clickOnElement(pom.getcp().getBooknow());
	}

	@Then("^user click logout in the confirmationpage$")
	public void user_click_login_in_the_confirmationpage() throws Throwable {
		clickOnElement(pom.getcp().getLogout());
	}
}
