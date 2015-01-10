package uk.co.keithsjohnson.accounts.view.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeView {

	@RequestMapping(value = "/")
	public String index(Model model) {
		return "index";
	}
}
