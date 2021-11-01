package com.example.demo.Controller;

import com.example.demo.Model.Veterinary;
import com.example.demo.Repository.VeterinarySI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "vet")

public class VeterineryController {

  @Autowired
  private VeterinarySI veterinarySI;

  @GetMapping(value = "/veterinaries")
  public List<Veterinary> getAllVeterinaries() {
    return veterinarySI.findAll();
  }
  @PostMapping(value = "/saveVet")
  public void saveOwner(Veterinary veterinary) {
    veterinarySI.save(veterinary);
  }

}
