package uk.co.keithsjohnson.accounts;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AccountsMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsMainApplication.class, args);

		new ArrayList().stream().count();
	}
}
