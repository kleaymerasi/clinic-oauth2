package com.example.demo.Model;


public class Visits {

  private Integer VisitId;
  private String Descriptions;
  private String Pet;
  private Integer veterinaryid;
  private String Dates;

  public Visits() {
  }

  public Integer getVisitId() {
    return VisitId;
  }

  public void setVisitId(Integer visitId) {
    VisitId = visitId;
  }

  public String getDescriptions() {
    return Descriptions;
  }

  public void setDescriptions(String descriptions) {
    Descriptions = descriptions;
  }

  public String getPet() {
    return Pet;
  }

  public void setPet(String pet) {
    Pet = pet;
  }

  public Integer getVeterinaryid() {
    return veterinaryid;
  }

  public void setVeterinaryid(Integer veterinaryid) {
    this.veterinaryid = veterinaryid;
  }

  public String getDates() {
    return Dates;
  }

  public void setDates(String dates) {
    Dates = dates;
  }

  public Visits(String Dates, String Descriptions, String Pet, Integer veterinaryid, Integer VisitId) {
    this.Dates = Dates;
    this.Descriptions = Descriptions;
    this.Pet = Pet;
    this.veterinaryid = veterinaryid;
    this.VisitId = VisitId;
  }
}
