package uk.co.keithsjohnson.accounts.view.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.keithsjohnson.accounts.action.GetAccountsAction;

@Controller
public class HomeView {

	private final GetAccountsAction getAccountsAction;

	@Autowired
	public HomeView(GetAccountsAction getAccountsAction) {
		this.getAccountsAction = getAccountsAction;
	}

	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("accounts", getAccountsAction.getAccounts());
		return "index";
	}
}
