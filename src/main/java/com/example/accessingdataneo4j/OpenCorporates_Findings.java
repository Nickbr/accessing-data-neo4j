package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class OpenCorporates_Findings {
	@Id @GeneratedValue protected Long id;

    public String name = "Corporate Data Registered Officer";
    public String partnerIcon = "/media/partners/corporatedata.svg";
    public OpenCorporates_Officer officer;
}
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

