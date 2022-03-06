// package com.example.accessingdataneo4j;
// import java.util.List;

// import com.example.accessingdataneo4j.PersonDataLab.Company;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// class CompanyController {

//   private final CompanyRepository companyRepository;

//   CompanyController(CompanyRepository companyRepository) {
//     this.companyRepository = companyRepository;
//   }


// //   Aggregate root
// //   tag::get-aggregate-root[]
//   @GetMapping("/company")
//   List<Company> all() {
//     return companyRepository.findAll();
//   }
//   // end::get-aggregate-root[]

//   @PostMapping("/company")
//   Company newCompany(@RequestBody Company newCompany) {
//     Company newc = companyRepository.save(newCompany);

//     // Person creator = repository.findByName(name)
//     return newc;
//   }

//   // Single item
  
//   @GetMapping("/company/{name}")
//   Company one(@PathVariable String name) {
    
//     return companyRepository.findByName(name);
//   }

//   @PutMapping("/company/{name}")
//   Company updateCompany(@RequestBody Company newCompany, @PathVariable String name) {
    
//     Company comp = companyRepository.findByName(name);

//     // peep.setName(newPerson.getName());
//     // person.setRole(newPerson.getRole());
//     // peep.setLinkedInUrl(newPerson.getLinkedInUrl());
//     return companyRepository.save(comp);
      
//   }

//   @DeleteMapping("/company/{id}")
//   void deleteCompany(@PathVariable Long id) {
//     companyRepository.deleteById(id);
//   }
// }