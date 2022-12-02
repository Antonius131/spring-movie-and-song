package org.generation.italy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getHome() {
		
		return "home";
	}
	
	@RequestMapping("/best-song")
	public String getBestSong() {
		
		return "best-song";
	}
	
	@RequestMapping("/best-movie")
	public String getBestMovie() {
		
		return "best-movie";
	}
}