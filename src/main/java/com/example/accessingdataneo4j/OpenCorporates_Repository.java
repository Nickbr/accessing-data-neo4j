package com.example.accessingdataneo4j;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OpenCorporates_Repository extends Neo4jRepository<OpenCorporates_Findings, Long> {

	// PersonDataLab findByName(String name);
	Optional<OpenCorporates_Findings> findById(Long id);
	// List<Person> findByCreateByName(String name);
}
