package com.example.demo.Repository;

import com.example.demo.Model.Owner;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OwnerMapper implements RowMapper<Owner> {

  @Override
  public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
    Owner owner = new Owner();
    owner.setOId(rs.getInt("OId"));
    owner.setFirstName(rs.getString("FirstName"));
    owner.setLastName(rs.getString("LastName"));
    owner.setAddress(rs.getString("Address"));
    owner.setPet(rs.getString("Pet"));
    owner.setTelephone(rs.getString("Telephone"));

    return owner;
  }
}
