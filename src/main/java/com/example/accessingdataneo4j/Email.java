package com.example.accessingdataneo4j;


import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Email{
	@Id @GeneratedValue protected Long id;

    public String address;
    public String type;
}
