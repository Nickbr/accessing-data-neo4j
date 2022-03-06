package com.example.accessingdataneo4j;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonDataLabRepository extends Neo4jRepository<PersonDataLab, Long> {

	PersonDataLab findByName(String name);
	Optional<PersonDataLab> findById(Long id);
	// List<Person> findByCreateByName(String name);
}
