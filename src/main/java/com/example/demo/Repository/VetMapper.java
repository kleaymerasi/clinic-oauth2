package com.example.demo.Repository;

import com.example.demo.Model.Veterinary;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VetMapper implements RowMapper<Veterinary> {

  @Override
  public Veterinary mapRow(ResultSet rs, int rowNum) throws SQLException {
    Veterinary veterinary = new Veterinary();
    veterinary.setVId(rs.getInt("VId"));
    veterinary.setFirstName(rs.getString("FirstName"));
    veterinary.setLastName(rs.getString("LastName"));
    veterinary.setSpeciality(rs.getString("Speciality"));
    return veterinary;
  }


}
