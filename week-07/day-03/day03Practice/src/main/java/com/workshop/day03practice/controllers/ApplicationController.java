package com.workshop.day03practice.controllers;

import com.workshop.day03practice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
public class ApplicationController {

  @Autowired
  UtilityService utilityService;

  ApplicationController(UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @RequestMapping("/useful")
  public String index(){
    return "main";
  }

  @GetMapping("/useful/colored")
  public String randomColored(Model model){

    model.addAttribute("randomColor", utilityService.randomColor());
    return "coloredPage";
  }

  @GetMapping("/useful/email")
  public String getValidEmailPage(Model model, @RequestParam(name="email", required = false) String email){
    if(email == null){
      return "validEmailDefault";
    }
    model.addAttribute("email",email);
    model.addAttribute("isValid",utilityService.valideteEmail(email));

    return "validEmail";
  }
  @PostMapping("/useful/email/validEmail")
  public String postValidEmailPage(Model model, @RequestParam(name="email") String email){

    model.addAttribute("email",email);
    model.addAttribute("isValid",utilityService.valideteEmail(email));

    return "validEmail";
  }
  @GetMapping("/useful/decoder")
  public String getDecoder(){
    return "decoder";
  }

  @PostMapping("/useful/decoder/decoderResult")
  public String postDecoder(Model model, @RequestParam(name="decoder") String decoder, @RequestParam(name="number") int number ){

    model.addAttribute("result",utilityService.caesar(decoder,number));

    return "decoderResult";
  }
}
