
package com.example.accessingdataneo4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

// import com.example.accessingdataneo4j.PersonDataLab.Company;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
// import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
// import org.apache.tomcat.util.json.JSONParser;
// import org.springframework.boot.json.JsonParser;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
public class Person {

	@Id @GeneratedValue protected Long id;

	protected String name;
	// private String data;

	public Person() {
		// Empty constructor required as of Neo4j API 2.0.5
	};

	public Person(String name) {
		this.name = name;
		// this.data = data;
	}

	/**
	 * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
	 * to ignore the direction of the relationship.
	 * https://dzone.com/articles/modelling-data-neo4j
	 */
	@Relationship(type = "Worked_at")
	public Set<PeopleDataLab_Company> workedAt;

	public void workedAt(PeopleDataLab_Company company) {
		if (workedAt == null) {
			workedAt = new HashSet<>();
		}
		workedAt.add(company);
	}

	@Relationship(type = "CorporateDataLabFinding")
	public Set<CorporateData_Findings> cdlFinding;

	public void cdlFindings(CorporateData_Findings cdlf) {
		if (cdlFinding == null) {
			cdlFinding = new HashSet<>();
		}
		cdlFinding.add(cdlf);
	}

	public Set<PeopleDataLab_Email> emails;
	public void emails(PeopleDataLab_Email email) {
		if (emails == null) {
			emails = new HashSet<>();
		}
		emails.add(email);
	}

	@Relationship(type = "PersonDataLab_findings")
	public Set<PeopleDataLab> finding;

	public void findings(PeopleDataLab pdlFindings) {
		if (finding == null) {
			finding = new HashSet<>();
		}
		finding.add(pdlFindings);
	}
	public String toString() {

		return this.name + " created ";

		// 	+ Optional.ofNullable(this.created).orElse(
		// 			Collections.emptySet()).stream()
		// 				.map(Company::getName)
		// 				.collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}	
	
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}

}
