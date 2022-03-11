package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class PeopleDataLab_Location{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
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
