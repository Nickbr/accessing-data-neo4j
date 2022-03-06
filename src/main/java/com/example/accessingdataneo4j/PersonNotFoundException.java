package com.example.accessingdataneo4j;
class PersonNotFoundException extends RuntimeException {

  PersonNotFoundException(Long id) {
    super("Could not find person " + id);
  }
}