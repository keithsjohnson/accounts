package uk.co.keithsjohnson.accounts.domain;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.keithsjohnson.accounts.model.Teammate;
import uk.co.keithsjohnson.accounts.service.repo.TeammateRepository;

@Service
public class DatabaseLoader {

	private final TeammateRepository teammateRepository;

	@Autowired
	public DatabaseLoader(TeammateRepository teammateRepository) {
		this.teammateRepository = teammateRepository;
	}

	@PostConstruct
	private void initDatabase() {
		Teammate roy = new Teammate("Roy", "Clarkson");
		roy.setPosition("1st base");
		teammateRepository.save(roy);

		Teammate phil = new Teammate("Phil", "Webb");
		phil.setPosition("pitcher");
		teammateRepository.save(phil);

	}
}