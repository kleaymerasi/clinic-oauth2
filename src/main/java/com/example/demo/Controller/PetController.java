package com.example.demo.Controller;

import com.example.demo.Model.Pet;
import com.example.demo.Repository.PetSI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/pet")
@RestController

public class PetController {

  @Autowired
  private PetSI petSI;

  @GetMapping(value = "/pets")
  public List<Pet> getAllPets() {
    return petSI.findAll();
  }


  @GetMapping(value = "/pets/{OId}")
  public Pet getPetById(@PathVariable Integer OId) {
    return petSI.getPetById(OId);

  }

  @PostMapping(value = "/savePet")
  public void savePet(Pet pet) {
    petSI.save(pet);
  }


}
