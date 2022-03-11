package com.example.accessingdataneo4j;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class PeopleDataLab_Title{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    public String name;
    public String role;
    public String sub_role;
    public ArrayList<String> levels;
}
