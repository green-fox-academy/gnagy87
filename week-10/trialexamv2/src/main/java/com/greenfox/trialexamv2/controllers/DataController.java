package com.greenfox.trialexamv2.controllers;
import com.greenfox.trialexamv2.models.Alias;
import com.greenfox.trialexamv2.models.SecretCode;
import com.greenfox.trialexamv2.services.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataController {

  AliasService aliasService;

  @Autowired
  public DataController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/api/links")
  public ResponseEntity storedEntries(){
    return ResponseEntity.status(200).body(aliasService.findAllAlias());
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity deleteAlias(@PathVariable("id") Long id, @RequestBody(required = false) SecretCode secretCode){
    int statusCode = aliasService.secretCodeMatcher(id,secretCode);

    return ResponseEntity.status(statusCode).build();
  }
}
