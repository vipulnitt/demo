package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
   @GetMapping("/msg")
   public String Show() {
	   return "Welcome to jenkin session";
   }
}
