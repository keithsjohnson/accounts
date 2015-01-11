package uk.co.keithsjohnson.accounts.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountJUnitTest {

	@Test
	public void shouldCreateNewAccount() {
		String name = "Name";
		long balance = 0;
		Account account = new Account("Name", balance);

		assertEquals(name, account.getName());
		assertEquals(balance, account.getBalance());
		assertEquals("Account [name=Name, balance=0]", account.toString());
	}
}
