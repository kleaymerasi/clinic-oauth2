package com.example.demo.Model;


public class Owner {

  private String LastName;
  private String FirstName;
  private Integer OId;
  private String Telephone;
  private String Pet;
  private String Address;

  public Owner() {
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public Integer getOId() {
    return OId;
  }

  public void setOId(Integer OId) {
    this.OId = OId;
  }

  public String getTelephone() {
    return Telephone;
  }

  public void setTelephone(String telephone) {
    Telephone = telephone;
  }

  public String getPet() {
    return Pet;
  }

  public void setPet(String pet) {
    Pet = pet;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public Owner(String FirstName, String LastName, Integer OId, String Telephone, String Pet, String Address) {
    this.Address = Address;
    this.OId = OId;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Pet = Pet;
    this.Telephone = Telephone;
  }
}
