package com.a0521.dda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.a0521.dda.dao.DeveloperRepository;
import com.a0521.dda.entity.Developer;

@Controller
@RequestMapping("/developers")
public class DeveloperController {
	@Autowired
	DeveloperRepository devRepo;
	
	@GetMapping
	public String displayDevelopers(Model model) {
		List<Developer> developers= devRepo.findAll();
		model.addAttribute("developerList",developers);
		return "developers/new-developers";
		
	}
	
//	@RequestMapping("/new")
	@GetMapping("/new")
	public String displayDeveloperForm(Model model) {
		model.addAttribute("developer",new Developer());
//		return "developers/new-developers";
		return "developers/new-developers";
		
	}
	
//	@RequestMapping(value="/save",method=RequestMethod.POST)
	@PostMapping("/save")
	public String createEmployee(Developer developer, Model model) {
		devRepo.save(developer);
		return "redirect:/";
		
		
	}

}
