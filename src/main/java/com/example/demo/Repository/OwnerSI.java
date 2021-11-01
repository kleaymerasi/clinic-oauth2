package com.example.demo.Repository;

import com.example.demo.Model.Owner;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface OwnerSI {
  List<Owner> findAll();
  void save(Owner owner);
 Owner findById(@PathVariable Integer OId);
 void update (Owner owner);
}
