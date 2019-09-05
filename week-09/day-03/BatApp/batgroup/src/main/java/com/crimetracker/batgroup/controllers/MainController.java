package com.crimetracker.batgroup.controllers;

import com.crimetracker.batgroup.models.BatFamilyMember;
import com.crimetracker.batgroup.services.BatService;
import com.crimetracker.batgroup.services.CriminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  BatService batService;
  CriminalService criminalService;

  @Autowired
  public MainController(BatService batService, CriminalService criminalService) {
    this.batService = batService;
    this.criminalService = criminalService;
  }

//  @GetMapping("/main")
//  public String getMainPage(Model model, @RequestParam("id") long id){
//    model.addAttribute("hero",batService.findMemberById(id));
//    return "main";
//  }
}
