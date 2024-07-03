package com.example.ThymeleafBasics.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class RootController {
    
	  @GetMapping
	  public String index(Model model)
	  {
		  model.addAttribute("pageTitle","TamingThymeleaf");
		  model.addAttribute("students",List.of("Ram","Shyam","Ravi"));
		  
		  return "index";
	  }
}
