package com.example.accessingdataneo4j;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

	Person findByName(String name);
	Optional<Person> findById(Long id);
	// List<Person> findByCreateByName(String name);
}
