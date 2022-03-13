package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node
public class PeopleDataLab_Profile{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    public String network;
    
    @Property("name")
    public String url;
    public String username;
}
