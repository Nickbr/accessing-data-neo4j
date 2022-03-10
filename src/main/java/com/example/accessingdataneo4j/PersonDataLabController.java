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
  private final CompanyRepository companyRepository;
  private final PersonDataLabRepository personDataLabRepository; 

  PersonDataLabController(PersonRepository personRepository, PersonDataLabRepository personDataLabPersonExtensionRepository, CompanyRepository companyRepository) {
    this.personRepository = personRepository;
    this.companyRepository = companyRepository;
    this.personDataLabRepository = personDataLabPersonExtensionRepository;
  }


//   Aggregate root
//   tag::get-aggregate-root[]
  // @GetMapping("/person")
  // List<Person> all() {
  //   return personRepository.findAll();
  // }
  // end::get-aggregate-root[]

  // @PostMapping("/persondatalabcontroller")
  // Person newPerson(@RequestBody Person newPerson) {
  //   Person newp = personRepository.save(newPerson);

  //   // Person creator = repository.findByName(name)
  //   return newp;
  // }

  // Single item
  
  // @GetMapping("/persondatalabcontroller/{name}")
  // Person one(@PathVariable String name) {
    
  //   return personRepository.findByName(name);
  // }

  @PutMapping("/persondatalabcontroller/{name}/{reportid}")
  PersonDataLab updatePerson(@RequestBody PersonDataLab data, @PathVariable String name, @PathVariable String reportid) throws Exception {
    
    Person peep = personRepository.findByName(name);
    System.out.println(name);
    System.out.println(peep);
    System.out.println(data);
    // peep = (PersonDataLabPersonExtension) peep;
    // peep.setName(newPerson.getName());
    // person.setRole(newPerson.getRole());
    // newPerson.SetLinkedinUrl(newPerson.getLinkedinUrl());
      
      personDataLabRepository.save(data);
      peep.findings(data);
      
      // PersonDataLab newPeep = new PersonDataLab(data);
      for (Experience exp : data.data.experience)
      {
        companyRepository.save(exp.company);
        peep.workedAt(exp.company);
      }
      // newPeep.setName(peep.getName());
      // newPeep.SetId(peep.getId());
      // newPerson.name = peep.name;
      // newPeep.SetData(data);
      personRepository.save(peep);
      // personRepository.delete(peep);
      // personDataLabRepository.save(newPeep);
      return null;
      
    // else{
    // }
  }

  // @DeleteMapping("/person/{id}")
  // void deletePerson(@PathVariable Long id) {
  //   personRepository.deleteById(id);
  // }
}