package com.selenium.Wordpress.test;

import org.testng.annotations.Test;
import com.selenium.Wordpress.AddPromoCode;
import com.selenium.Wordpress.ListPromoCode;
import com.selenium.Wordpress.Login;

public class SanityTest extends TestNGAnnotationTest{
	public Login login;
	public AddPromoCode addpromocode;
	public ListPromoCode listPromoCode;
	

	public SanityTest() {
		login = new Login();
		addpromocode = new AddPromoCode();
		listPromoCode = new ListPromoCode();
	}

	@Test(testName = "wordpress", description = "imp test cases", timeOut = 1500000, enabled = true, groups = {
			"1", "Sanity", "Regression", "UI" })
	public void awordpress() {
		login.loginApp();
		addpromocode.addNewPromoCode("D_two ","desc","Dec/19/2013","Jan/19/2014","5","Active","Amount","5444","ALL");
		listPromoCode.listingPromoCode();
		listPromoCode.delPromoCode();
		login.logout();
	}
	
	
	@Test(testName = "promocode", description = "invalid test cases", timeOut = 1500000, enabled = true, groups = {
			"2","Regression", "UI" })
	public void bpromocodeTestcases() {
		login.loginApp();
		
			addpromocode.addNewPromoCode("  ","desc","Dec/19/2013","Jan/19/2014","5","Active","Amount","5444","ALL");
			
			addpromocode.addNewPromoCode("D.DEC$1  ","desc","Dec-19-2013","Jan-19-2014","5","Active","Amount","5444","ALL");
			
			addpromocode.addNewPromoCode("DDECEMBERJANUARYFEBUARYMAR","desc","dec-19-2013","jan-19-2014","5","Active","Amount","5444","ALL");
			
			addpromocode.addNewPromoCode("D.DEC$1  ","desc","Dec-19-2013","Jan-19-2014","5","Active","Amount","5444","ALL");
		

	}
	@Test(testName = "description", description = "invalid test cases", timeOut = 1500000, enabled = true, groups = {
			"3","Regression", "UI" })
	public void cdescTestcases() {
		login.loginApp();
		
			addpromocode.addNewPromoCode("D_ONE","   ","Dec/19/2013","Jan/19/2014","5","Active","Amount","5444","ALL");
			
			addpromocode.addNewPromoCode("D_ONE","abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklm","Dec-19-2013","Jan-19-2014","5","Active","Amount","5444","ALL");
			
			addpromocode.addNewPromoCode("D_ONE","abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijkl","dec-19-2013","jan-19-2014","5","Active","Amount","5444","ALL");
			
			addpromocode.addNewPromoCode("D_ONE","desc","Dec-19-2013","Jan-19-2014","5","Active","Amount","5444","ALL");
		

	}
	}



