package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class CorporateData_Company {
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/corporatedata.svg";
        public String name;
        public String jurisdiction_code;
        public String company_number;
        public String opencorporates_url;
    } 

