package com.example.demo.Repository;

import com.example.demo.Model.Owner;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.sql.DataSource;
import java.util.List;

@Service
public class OwnerService implements OwnerSI {

  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public OwnerService(DataSource dataSource) {
    namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
  }

  @Override
  public List<Owner> findAll() {
    return namedParameterJdbcTemplate.query("SELECT * FROM Owner", new OwnerMapper());
  }

  @Override
  public void save(Owner owner) {
    String sql = "INSERT INTO Owner (OId,FirstName, LastName, Address,Telephone,Pet) VALUES (:OId,:FirstName, :LastName, :Address,:Telephone ,:Pet)";
    BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(owner);
    namedParameterJdbcTemplate.update(sql, paramSource);
  }

  @Override
  public Owner findById(@PathVariable Integer OId) {
    String sql = "SELECT * FROM Owner Where OId=" + OId;
    return namedParameterJdbcTemplate.query(sql, rs -> {
      if (rs.next()) {
        Owner owner = new Owner();
        owner.setOId(rs.getInt("OId"));
        owner.setFirstName(rs.getString("FirstName"));
        owner.setTelephone(rs.getString("Telephone"));
        owner.setAddress(rs.getString("Address"));
        owner.setLastName(rs.getString("LastName"));
        owner.setPet(rs.getString("Pet"));
        return owner;
      }
      return null;
    });
  }

  @Override
  public void update(Owner owner) {
    String sql = "UPDATE Owner SET FirstName = :FirstName ,LastName = :LastName , Address = :Address , Pet = :Pet , Telephone = :Telephone where OId = :OId";
    BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(owner);
    namedParameterJdbcTemplate.update(sql, paramSource);
  }
}
