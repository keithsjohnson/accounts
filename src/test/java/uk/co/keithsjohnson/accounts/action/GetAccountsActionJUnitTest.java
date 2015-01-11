package uk.co.keithsjohnson.accounts.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.keithsjohnson.accounts.action.GetAccountsAction;
import uk.co.keithsjohnson.accounts.domain.AccountsRetreiver;
import uk.co.keithsjohnson.accounts.model.Account;

@RunWith(MockitoJUnitRunner.class)
public class GetAccountsActionJUnitTest {

	private GetAccountsAction testSubject;

	@Mock
	private AccountsRetreiver mockAccountsRetreiver;

	@Before
	public void setUp() {
		testSubject = new GetAccountsAction(mockAccountsRetreiver);
	}

	@Test
	public void shouldGetAccounts() {
		// Given
		List<Account> accounts = new ArrayList<>();
		when(mockAccountsRetreiver.getAccounts()).thenReturn(accounts);

		// When
		List<Account> returnAccounts = testSubject.getAccounts();

		// Then
		assertNotNull(returnAccounts);
		assertEquals(accounts, returnAccounts);

	}
}
