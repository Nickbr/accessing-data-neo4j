
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



@Node
public class PersonDataLab extends Person {
    

	// private Root data;
	// private String data;
    private String linkedin_url;

	private PersonDataLab()  {
		// Empty constructor required as of Neo4j API 2.0.5
	};

	public PersonDataLab(Root data) {
		this.linkedin_url = data.data.linkedin_url;
		// this.data = data;
	}
    // public void SetId(Long id){
    //     this.id = id;
    // }

	/**
	 * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
	 * to ignore the direction of the relationship.
	 * https://dzone.com/articles/modelling-data-neo4j
	 */
	// @Relationship(type = "Create")
	// public Set<Company> created;

	// public void worksWith(Company company) {
	// 	if (created == null) {
	// 		created = new HashSet<>();
	// 	}
	// 	created.add(company);
	// }

	// public String toString() {

	// 	return this.name + " created "
	// 		+ Optional.ofNullable(this.created).orElse(
	// 				Collections.emptySet()).stream()
	// 					.map(Company::getName)
	// 					.collect(Collectors.toList());
	// }

	// public String getName() {
	// 	return name;
	// }	
	
	// public void setName(String name) {
	// 	this.name = name;
	// }

	public String getLinkedInUrl() {
		return linkedin_url;
	}	
	
	public void SetLinkedInUrl(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public static class Email{
    public String address;
    public String type;
}

public static class Location{
    public String name;
    public String locality;
    public String region;
    public String metro;
    public String country;
    public String continent;
    public String street_address;
    public Object address_line_2;
    public String postal_code;
    public String geo;
}

public static class Company{
    public String name;
    public String size;
    public String id;
    public int founded;
    public String industry;
    public Location location;
    public String linkedin_url;
    public String linkedin_id;
    public String facebook_url;
    public String twitter_url;
    public String website;
}

public static class Title{
    public String name;
    public String role;
    public String sub_role;
    public ArrayList<String> levels;
}

public static class Experience{
    public Company company;
    public String start_date;
    public String end_date;
    public Title title;
    public ArrayList<String> location_names;
    public boolean is_primary;
}

public static class School{
    public String name;
    public String type;
    public String id;
    public Location location;
    public String linkedin_url;
    public String facebook_url;
    public String twitter_url;
    public String linkedin_id;
    public String website;
    public String domain;
}

public static class Education{
    public School school;
    public ArrayList<Object> degrees;
    public Object start_date;
    public Object end_date;
    public ArrayList<Object> majors;
    public ArrayList<Object> minors;
    public Object gpa;
}

public static class Profile{
    public String network;
    public String id;
    public String url;
    public String username;
}

public static class Data{
    public String id;
    public String full_name;
    public String first_name;
    public Object middle_initial;
    public Object middle_name;
    public String last_initial;
    public String last_name;
    public String gender;
    public Object birth_year;
    public Object birth_date;
    public String linkedin_url;
    public String linkedin_username;
    public String linkedin_id;
    public String facebook_url;
    public String facebook_username;
    public String facebook_id;
    public Object twitter_url;
    public Object twitter_username;
    public Object github_url;
    public Object github_username;
    public Object work_email;
    public ArrayList<String> personal_emails;
    public Object mobile_phone;
    public String industry;
    public String job_title;
    public String job_title_role;
    public Object job_title_sub_role;
    public ArrayList<String> job_title_levels;
    public Object job_company_id;
    public String job_company_name;
    public Object job_company_website;
    public Object job_company_size;
    public Object job_company_founded;
    public Object job_company_industry;
    public Object job_company_linkedin_url;
    public Object job_company_linkedin_id;
    public Object job_company_facebook_url;
    public Object job_company_twitter_url;
    public Object job_company_location_name;
    public Object job_company_location_locality;
    public Object job_company_location_metro;
    public Object job_company_location_region;
    public Object job_company_location_geo;
    public Object job_company_location_street_address;
    public Object job_company_location_address_line_2;
    public Object job_company_location_postal_code;
    public Object job_company_location_country;
    public Object job_company_location_continent;
    public String job_last_updated;
    public String job_start_date;
    public String location_name;
    public String location_locality;
    public Object location_metro;
    public String location_region;
    public String location_country;
    public String location_continent;
    public Object location_street_address;
    public Object location_address_line_2;
    public Object location_postal_code;
    public String location_geo;
    public String location_last_updated;
    public ArrayList<Object> phone_numbers;
    public ArrayList<Email> emails;
    public ArrayList<Object> interests;
    public ArrayList<String> skills;
    public ArrayList<String> location_names;
    public ArrayList<String> regions;
    public ArrayList<String> countries;
    public ArrayList<Object> street_addresses;
    public ArrayList<Experience> experience;
    public ArrayList<Education> education;
    public ArrayList<Profile> profiles;
}

public static class Root{
    public Data data;
    public int match_score;
    public ArrayList<String> matched_on;
}




}

