package com.example.demo.Repository;


import com.example.demo.Model.Pet;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PetSI {
  List<Pet> findAll();
  Pet getPetById(@PathVariable Integer OId);
  void save(Pet pet);
}
