package com.example.demo.Repository;

import com.example.demo.Model.Visits;

import java.util.List;

public interface VisitsSI {

  void AddVisitToVet(Visits visits);
 List<Visits>	getAllVisitsOfVet();
}
