package uk.co.keithsjohnson.accounts.service.repo;

import org.springframework.data.repository.CrudRepository;

import uk.co.keithsjohnson.accounts.model.Teammate;

public interface TeammateRepository extends CrudRepository<Teammate, Long> {
}