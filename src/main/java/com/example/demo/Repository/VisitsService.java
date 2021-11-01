package com.example.demo.Repository;

import com.example.demo.Model.Visits;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class VisitsService implements VisitsSI {

  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


  public VisitsService(DataSource dataSource) {
    namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
  }

  @Override
  public void AddVisitToVet(Visits visits) {
    String sql = "INSERT INTO Visits (Pet, Descriptions, Dates,veterinaryid) VALUES (:Pet, :Descriptions, :Dates, :veterinaryid)";
    BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(visits);
    namedParameterJdbcTemplate.update(sql, paramSource);

  }

  @Override
  public List<Visits> getAllVisitsOfVet() {
      return namedParameterJdbcTemplate.query("SELECT * FROM Visits", new VisitsMapper());
  }
}
