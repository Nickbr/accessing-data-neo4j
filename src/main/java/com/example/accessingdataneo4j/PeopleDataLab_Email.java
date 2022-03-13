package com.example.accessingdataneo4j;


import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node
public class PeopleDataLab_Email{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    
    @Property("name")
    public String address;
    public String type;
}
