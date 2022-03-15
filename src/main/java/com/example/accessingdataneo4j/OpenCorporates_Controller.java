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
class OpenCorporates_Controller {

  private final PersonRepository personRepository;
  private final OpenCorporates_Repository openCorporates_Repository; 
  private final OpenCorporates_CompanyRepository openCorporates_CompanyRepository; 

  OpenCorporates_Controller(PersonRepository personRepository, OpenCorporates_Repository openCorporates_Repository, OpenCorporates_CompanyRepository openCorporates_CompanyRepository) {
    this.personRepository = personRepository;
    this.openCorporates_Repository = openCorporates_Repository;
    this.openCorporates_CompanyRepository = openCorporates_CompanyRepository;
  }


  @PutMapping("/ocUpdatePerson/{name}/{reportid}")
  void updatePerson(@RequestBody OpenCorporates_Findings data, @PathVariable String name, @PathVariable String reportid) throws Exception {
    System.out.print("ocUpdatePerson");
    this.openCorporates_Repository.save(data);
    Person peep = this.personRepository.findByName(name);
    peep.cdlFindings(data);

    this.personRepository.save(peep);
  }

  @PutMapping("/ocUpdateCompany/{name}/{reportid}")
  void updateCompany(@RequestBody OpenCorporates_CompanyFindings data, @PathVariable String name, @PathVariable String reportid) throws Exception {
    System.out.print("ocUpdateCompany");
    this.openCorporates_CompanyRepository.save(data);
    Person peep = this.personRepository.findByName(name);
    peep.ocFindings(data);

    this.personRepository.save(peep);

  }

}