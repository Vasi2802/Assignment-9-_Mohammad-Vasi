package org.antwalk.customers;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("cs")
public class Customersaving {
	private String Account_no="987655329887766";
	private String name="Mohammad Vasi";
	private String email="abcd@gmail.com";
	private String username="vasi1344";
	private String password="9949494";
	private int age=22;
	private String Address="Kolkata";
	private String phone="987654321";
	private float balance=200000f;
	
	@Autowired
	@Qualifier("saving")
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

