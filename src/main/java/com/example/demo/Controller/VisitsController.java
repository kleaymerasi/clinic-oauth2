package com.example.demo.Controller;

import com.example.demo.Model.Visits;
import com.example.demo.Repository.VisitsSI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/visits")

public class VisitsController {

  @Autowired
  private VisitsSI visitsSI;

  @PostMapping(value = "/addVisit")
  public void AddVisitToVet(Visits visits) {
    visitsSI.AddVisitToVet(visits);
  }

  @GetMapping(value = "/visitsall")
  public List<Visits> getAllVisitsOfVet() {
    return visitsSI.getAllVisitsOfVet();
  }


}
