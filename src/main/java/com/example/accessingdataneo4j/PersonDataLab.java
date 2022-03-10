
package com.example.accessingdataneo4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
// import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
// import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
// import org.apache.tomcat.util.json.JSONParser;
// import org.springframework.boot.json.JsonParser;
// import org.springframework.data.neo4j.core.schema.GeneratedValue;



// @Node
// public class PersonDataLab {
    

// 	// private Root data;
// 	// private String data;
//     private String linkedin_url;
//     private String facebook_url;
//     private String gender;
//     private String industry;
//     private String work_email;
//     private String job_title;
//     private String job_title_role;
//     private String job_company_name;

// 	private PersonDataLab()  {
// 		// Empty constructor required as of Neo4j API 2.0.5
// 	};

// 	public PersonDataLab(Root data) {
// 		this.linkedin_url = data.data.linkedin_url;
// 		this.facebook_url = data.data.facebook_url;
// 		this.gender = data.data.gender;
// 		this.industry = data.data.industry;
// 		this.work_email = (String) data.data.work_email;
// 		this.job_title = data.data.job_title;
// 		this.job_title_role = data.data.job_title_role;
// 		this.job_company_name = data.data.job_company_name;
// 		// this.data = data;
// 	}
//     // public void SetId(Long id){
//     //     this.id = id;
//     // }

// 	/**
// 	 * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
// 	 * to ignore the direction of the relationship.
// 	 * https://dzone.com/articles/modelling-data-neo4j
// 	 */
// 	// @Relationship(type = "Create")
// 	// public Set<Company> created;

// 	// public void worksWith(Company company) {
// 	// 	if (created == null) {
// 	// 		created = new HashSet<>();
// 	// 	}
// 	// 	created.add(company);
// 	// }

// 	// public String toString() {

// 	// 	return this.name + " created "
// 	// 		+ Optional.ofNullable(this.created).orElse(
// 	// 				Collections.emptySet()).stream()
// 	// 					.map(Company::getName)
// 	// 					.collect(Collectors.toList());
// 	// }

// 	// public String getName() {
// 	// 	return name;
// 	// }	
	
// 	// public void setName(String name) {
// 	// 	this.name = name;
// 	// }

// 	public String GetLinkedInUrl() {
// 		return linkedin_url;
// 	}	
	
// 	public void SetLinkedInUrl(String linkedin_url) {
// 		this.linkedin_url = linkedin_url;
// 	}
// 	public String Getfacebook_url() {
// 		return facebook_url;
// 	}	
	
// 	public void Setfacebook_url(String facebook_url) {
// 		this.facebook_url = facebook_url;
// 	}
// 	public String Getgender() {
// 		return gender;
// 	}	
	
// 	public void Setgender(String gender) {
// 		this.gender = gender;
// 	}
// 	public String Getindustry() {
// 		return industry;
// 	}	
	
// 	public void Setindustry(String industry) {
// 		this.industry = industry;
// 	}
// 	public String Getwork_email() {
// 		return work_email;
// 	}	
	
// 	public void Setwork_email(String work_email) {
// 		this.work_email = work_email;
// 	}
// 	public String Getjob_title() {
// 		return job_title;
// 	}	
	
// 	public void Setjob_title(String job_title) {
// 		this.job_title = job_title;
// 	}
// 	public String Getjob_title_role() {
// 		return job_title_role;
// 	}	
	
// 	public void Setjob_title_role(String job_title_role) {
// 		this.job_title_role = job_title_role;
// 	}
// 	public String Getjob_company_name() {
// 		return job_company_name;
// 	}	
	
// 	public void Setjob_company_name(String job_company_name) {
//		this.job_company_name = job_company_name;
//	}

	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */


@Node
public class PersonDataLab{
	@Id @GeneratedValue protected Long id;

    public String source = "People Data Labs";
    public PersonDataLabFindings data;
    public int match_score;
    public ArrayList<String> matched_on;
}






