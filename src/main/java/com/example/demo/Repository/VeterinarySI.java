package com.example.demo.Repository;


import com.example.demo.Model.Veterinary;

import java.util.List;

public interface VeterinarySI {
  List<Veterinary> findAll();
  void save(Veterinary veterinary);
}
