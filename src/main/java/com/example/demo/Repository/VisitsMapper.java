package com.example.demo.Repository;

import com.example.demo.Model.Visits;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VisitsMapper implements RowMapper<Visits> {

  public Visits mapRow(ResultSet rs, int rowNum) throws SQLException {
    Visits visits = new Visits();
    visits.setVeterinaryid(rs.getInt("veterinaryid"));
    visits.setVisitId(rs.getInt("VisitId"));
    visits.setDates(rs.getString("Dates"));
    visits.setDescriptions(rs.getString("Descriptions"));
    visits.setPet(rs.getString("Pet"));

    return visits;
  }
}
