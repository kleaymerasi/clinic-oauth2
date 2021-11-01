package com.example.demo.Repository;

import com.example.demo.Model.Veterinary;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class VeterinaryService implements VeterinarySI {


  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public VeterinaryService(DataSource dataSource) {
    namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
  }

  @Override
  public List<Veterinary> findAll() {
    return namedParameterJdbcTemplate.query("SELECT * FROM Veterinary", new VetMapper());
  }

  @Override
  public void save(Veterinary veterinary) {
    String sql = "INSERT INTO Veterinary (VId,FirstName, LastName, Speciality) VALUES (:VId,:FirstName, :LastName, :Speciality)";
    BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(veterinary);
    namedParameterJdbcTemplate.update(sql, paramSource);
  }
}

