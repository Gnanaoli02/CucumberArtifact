package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookingPage;
import com.adactin.pom.ConfirmationPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.LoginPage;

public class PageObjectManager {

	public static WebDriver driver;

	private SearchHotelPage sh;
	private BookingPage bp;
	private ConfirmationPage cp;
	private LoginPage lp;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public LoginPage getlp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public SearchHotelPage getsh() {
		sh = new SearchHotelPage(driver);
		return sh;
	}

	public BookingPage getbp() {
		bp = new BookingPage(driver);
		return bp;
	}

	public ConfirmationPage getcp() {
		cp = new ConfirmationPage(driver);
		return cp;
	}

}
