package uk.co.keithsjohnson.accounts.view.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.keithsjohnson.accounts.action.GetAccountsAction;

@Controller
public class HomeView {

	@Value("${test.value}")
	String testValue;

	@Value("${value1}")
	String value1;

	@Value("${value2}")
	String value2;

	@Value("${values}")
	String[] values;

	private final GetAccountsAction getAccountsAction;

	@Autowired
	public HomeView(GetAccountsAction getAccountsAction) {
		this.getAccountsAction = getAccountsAction;
	}

	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("accounts", getAccountsAction.getAccounts());
		model.addAttribute("value1", value1);
		model.addAttribute("value2", value2);
		model.addAttribute("testValue", testValue);
		model.addAttribute("values", values);
		System.out.println("Model: " + model.toString());
		return "index";
	}
}
