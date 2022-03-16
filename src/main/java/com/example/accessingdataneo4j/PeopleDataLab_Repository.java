package com.example.accessingdataneo4j;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PeopleDataLab_Repository extends Neo4jRepository<PeopleDataLab, Long> {

	PeopleDataLab findByName(String name);
	Optional<PeopleDataLab> findById(Long id);
	// List<Person> findByCreateByName(String name);
}
