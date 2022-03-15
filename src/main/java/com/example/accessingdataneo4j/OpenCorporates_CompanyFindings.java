package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class OpenCorporates_CompanyFindings {
	@Id @GeneratedValue protected Long id;
    public String partnerIcon = "/media/partners/opencorporates.svg";   
        public String api_version;
        public OpenCorporates_Results results;
    
}
