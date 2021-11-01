package com.example.demo.Controller;


import com.example.demo.Model.Owner;
import com.example.demo.Repository.OwnerSI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/app")

public class OwnerController {

  @Autowired
  private OwnerSI ownerSI;

  @GetMapping(value = "/owners")
  public List<Owner> getAllOwners() {
    return ownerSI.findAll();
  }

  @PostMapping(value = "/saveOwner")
  public void saveOwner(Owner owner) {
    ownerSI.save(owner);
  }

  @GetMapping(value = "/owner/{OId}")
  public Owner getOwnerById( @PathVariable Integer OId) {
    return ownerSI.findById(OId);
  }

  @PostMapping(value = "/update")
  public void update(Owner owner) {
    ownerSI.update(owner);
  }
}
