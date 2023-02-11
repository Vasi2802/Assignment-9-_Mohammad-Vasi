package org.antwalk;

import org.antwalk.customers.Customercurrent;
import org.antwalk.customers.Customersaving;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	Customersaving saving=context.getBean("cs",Customersaving.class);
	Customercurrent current=context.getBean("cc",Customercurrent.class);
	saving.Details();
	current.Details();
	context.close();
	}
}
