package com.bikkadIT.UIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bikkadIT.UIToController.Model.Student;

@Controller
public class WelcomeController {
	  @GetMapping("/welcomeMsg")
      public String getWelcomeMsg(@RequestParam String name,String course,Model model )
      {
		Student student=new Student();
		student.setStudId(101);
		student.setName("sheetal");
		student.setAddress("pune");
		String msg="Hii "+ name + " Welcome to bikkad IT" ;
		String crs="Hello Students " + course + " Batch started from 1 feb 2023";
		
		System.out.println(msg);
		System.out.println(crs);
		model.addAttribute("MESSAGE", msg);
		model.addAttribute("COURSE", crs);
		model.addAttribute("StudData", student);
		return "message";
    	  
    	  
    	  
    	  
      }
}
