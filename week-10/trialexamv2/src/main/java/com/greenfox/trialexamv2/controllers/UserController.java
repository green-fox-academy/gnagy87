package com.greenfox.trialexamv2.controllers;
import com.greenfox.trialexamv2.services.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private AliasService aliasService;

  @Autowired
  public UserController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/")
  public String renderMainPage (){
    return "main";
  }

  @PostMapping("/save-link")
  public String saveAlias(@RequestParam (value = "url", required = false) String url,
                          @RequestParam (value = "alias",required = false)String alias,
                          Model model){

    if (aliasService.findAliasByAlias(alias) == null){
      aliasService.saveAlias(url,alias);
      model.addAttribute("alias", aliasService.findAliasByAlias(alias));
      model.addAttribute("success", true);
      return "main";
    } else {
      model.addAttribute("alias", alias);
      model.addAttribute("url", url);
      model.addAttribute("failure", true);
      return "main";
    }
  }

  @GetMapping("/a/{alias}")
  public Object incrementHitCount(@PathVariable ("alias") String alias){
    if (aliasService.findAliasByAlias(alias) != null){
      aliasService.incrementHitCount(alias);
      String url = aliasService.findAliasByAlias(alias).getUrl();
      return "redirect:https://" + url;
    }
      return new ResponseEntity(HttpStatus.NOT_FOUND);
  }
}
