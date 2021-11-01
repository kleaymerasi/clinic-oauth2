package com.example.demo.Model;

public class Veterinary {

private int VId;
private String FirstName;
private String LastName;
private String Speciality;


public Veterinary(){}

  public int getVId() {
    return VId;
  }

  public void setVId(int VId) {
    this.VId = VId;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public String getSpeciality() {
    return Speciality;
  }

  public void setSpeciality(String speciality) {
    Speciality = speciality;
  }

  public Veterinary (int VId, String FirstName, String Speciality,String LastName){
  this.Speciality=Speciality;
  this.FirstName=FirstName;
  this.VId=VId;
  this.LastName=LastName;

  }
}
