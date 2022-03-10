package com.example.accessingdataneo4j;

import java.util.List;
import java.util.Optional;

// import com.example.accessingdataneo4j.PersonDataLab.Company;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CompanyRepository extends Neo4jRepository<Company, Long> {

	Company findByName(String name);
	Optional<Company> findById(Long id);
	// List<Company> findByCreateByName(String name);
}
