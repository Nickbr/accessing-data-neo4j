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
class CorporateData_Controller {

  private final PersonRepository personRepository;
  private final CorporateData_Repository corporateDataRepository; 

  CorporateData_Controller(PersonRepository personRepository, CorporateData_Repository corporateDataRepository) {
    this.personRepository = personRepository;
    this.corporateDataRepository = corporateDataRepository;
  }


  @PutMapping("/corporatedatacontroller/{name}/{reportid}")
  PeopleDataLab updatePerson(@RequestBody CorporateData_Findings data, @PathVariable String name, @PathVariable String reportid) throws Exception {
    
    corporateDataRepository.save(data);
    Person peep = personRepository.findByName(name);
    peep.cdlFindings(data);

    personRepository.save(peep);
    return null;

  }

}