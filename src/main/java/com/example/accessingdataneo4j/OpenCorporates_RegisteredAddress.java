package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class OpenCorporates_RegisteredAddress {
	@Id @GeneratedValue protected Long id;
    public String partnerIcon = "/media/partners/opencorporates.svg";
    public String street_address;
    public String locality;
    public Object region;
    public String postal_code;
    public String country;
}
