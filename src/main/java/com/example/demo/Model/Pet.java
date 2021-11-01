package com.example.demo.Model;

public class Pet {

  private int PId;
  private String FirstName;
  private String Specie;
  private Integer OId;


  public Pet() {
  }

  public Integer getOId() {
    return OId;
  }

  public void setOId(Integer OId) {
    this.OId = OId;
  }

  public int getPId() {
    return PId;
  }

  public void setPId(int PId) {
    this.PId = PId;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getSpecie() {
    return Specie;
  }

  public void setSpecie(String specie) {
    Specie = specie;
  }

  public Pet(String FirstName, int PId, String Specie, Integer OId) {
    this.FirstName = FirstName;
    this.PId = PId;
    this.Specie = Specie;
    this.OId = OId;

  }
}
