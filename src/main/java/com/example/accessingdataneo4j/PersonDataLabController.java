package com.example.accessingdataneo4j;
// import java.util.List;

import java.io.Console;

// import com.example.accessingdataneo4j.PersonDataLab.Company;
// import com.example.accessingdataneo4j.PersonDataLab.Experience;
// import com.example.accessingdataneo4j.PersonDataLab.Root;

import org.apache.commons.logging.Log;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonDataLabController {

  private final PersonRepository personRepository;
  private final PersonDataLabRepository personDataLabRepository; 

  PersonDataLabController(PersonRepository personRepository, PersonDataLabRepository personDataLabPersonExtensionRepository) {
    this.personRepository = personRepository;
    this.personDataLabRepository = personDataLabPersonExtensionRepository;
  }


  @PutMapping("/persondatalabcontroller/{name}/{reportid}")
  PersonDataLab updatePerson(@RequestBody PersonDataLab data, @PathVariable String name, @PathVariable String reportid) throws Exception {
    
    Person peep = personRepository.findByName(name);
    personDataLabRepository.save(data);
    peep.findings(data);
    
    personRepository.save(peep);
    return null;

  }

}