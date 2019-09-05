package com.crimetracker.batgroup.controllers;

import com.crimetracker.batgroup.models.BatFamilyMember;
import com.crimetracker.batgroup.models.Criminal;
import com.crimetracker.batgroup.services.BatService;
import com.crimetracker.batgroup.services.CriminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  BatService batService;
  CriminalService criminalService;

  @Autowired
  public LoginController(BatService batService, CriminalService criminalService) {
    this.batService = batService;
    this.criminalService = criminalService;
  }

  @GetMapping("/login")
  public String getLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage(@RequestParam (name = "memberName", required = false)
                              String memberName,
                              @RequestParam (name = "password", required = false)
                              String password){
    if (!memberName.equals("") && !password.equals("")){
      batService.saveBatMember(memberName,password);
      BatFamilyMember batFamilyMember = batService.findMemberByName(memberName);

      return "redirect:/main?id=" + batFamilyMember.getId();
    }
    else {
      return "login";
    }
  }
  @GetMapping("/main")
  public String getMainPage(Model model, @RequestParam("id") long id){
    model.addAttribute("hero",batService.findMemberById(id));
    return "main";
  }
}
