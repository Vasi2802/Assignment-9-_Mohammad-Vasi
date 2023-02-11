package org.antwalk.accounts;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{
	public String showAccount() {
		return "Current Account";
	}

}
