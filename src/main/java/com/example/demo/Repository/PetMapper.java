package com.example.demo.Repository;


import com.example.demo.Model.Pet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PetMapper implements RowMapper<Pet> {

  @Override
  public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
    Pet pet = new Pet();
    pet.setPId(rs.getInt("PId"));
    pet.setFirstName(rs.getString("FirstName"));
    pet.setSpecie(rs.getString("Specie"));
    return pet;
  }


}
