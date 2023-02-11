package org.antwalk.accounts;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("saving")
public class Saving implements Account {
	
		public String showAccount() {
			return "Savings Account";
		}
		
	}
