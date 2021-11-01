package com.example.demo.Repository;

import com.example.demo.Model.Pet;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.sql.DataSource;
import java.util.List;

@Service
public class PetService implements PetSI {

  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


  public PetService(DataSource dataSource) {
    namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
  }

  @Override
  public List<Pet> findAll() {
    return namedParameterJdbcTemplate.query("SELECT * FROM Pets", new PetMapper());
  }

  @Override
  public Pet getPetById(@PathVariable Integer OId) {
    String sql = "select * from Pets inner join Owner on Pets.OId=Owner.OId where Owner.OId=" + OId;
    return namedParameterJdbcTemplate.query(sql, rs -> {
      if (rs.next()) {
        Pet pet = new Pet();
        pet.setOId(rs.getInt("OId"));
        pet.setFirstName(rs.getString("FirstName"));
        pet.setPId(rs.getInt("PId"));
        pet.setSpecie(rs.getString("Specie"));
        return pet;
      }
      return null;
    });
  }


  @Override
  public void save(Pet pet) {
    String sql = "INSERT INTO Pets (FirstName, Specie, PId) VALUES (:FirstName, :Specie, :PId)";
    BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(pet);
    namedParameterJdbcTemplate.update(sql, paramSource);
  }
}


