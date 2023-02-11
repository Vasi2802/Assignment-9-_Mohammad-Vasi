package org.antwalk.customers;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("cc")
public class Customercurrent {
	private String Account_no="93746484944739373";
	private String name="Saurabh Rawat";
	private String email="saurabh@gmail.com";
	private String username="saurabh1344";
	private String password="12345";
	private int age=23;
	private String Address="Dehradun";
	private String phone="987654321";
	private float balance=100000f;
	
	@Autowired
	@Qualifier("current")
	Account acc;
	
	public void Details()
	{
		System.out.println("Account Details");
		System.out.println("===============");
		System.out.println("Account_NO :"+Account_no);
		System.out.println("Account Holder : "+name);
		System.out.println("Email ID : "+email);
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Age : "+age);
		System.out.println("Address : "+Address);
		System.out.println("Phone No. : "+phone);
		System.out.println("Balance : "+balance);
		System.out.println("Account Type : "+acc.showAccount());
		System.out.println("*******************************************************");
		System.out.println("*******************************************************");
		System.out.println();
	}
}
