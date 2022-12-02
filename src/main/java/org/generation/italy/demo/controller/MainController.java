package org.generation.italy.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.demo.pojo.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getHome() {
		
		return "home";
	}
	
	
	@RequestMapping("/best-movie")
	public String getBestMovie(Model model) {
		
		List<Movie> movies = new ArrayList<>();
		
		movies.add(new Movie("Primo"));
		movies.add(new Movie("Secondo"));
		movies.add(new Movie("Terzo"));
		movies.add(new Movie("Quarto"));
		movies.add(new Movie("Quinto"));
		
		model.addAttribute("movies", movies);
		
		return "best-movie";
	}
	

	@RequestMapping("/best-song")
	public String getBestSong() {
		
		return "best-song";
	}
}