package com.example.accessingdataneo4j;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OpenCorporates_CompanyRepository extends Neo4jRepository<OpenCorporates_CompanyFindings, Long> {

	// OpenCorporates_CompanyFindings findByName(String name);
	Optional<OpenCorporates_CompanyFindings> findById(Long id);
	// List<Person> findByCreateByName(String name);
}
