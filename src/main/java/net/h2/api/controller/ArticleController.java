package net.h2.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.h2.api.dao.ArticleRepository;
import net.h2.api.model.Article;
import net.h2.api.model.Categorie;
@CrossOrigin
@RestController
public class ArticleController {
	@Autowired
	private  ArticleRepository rep;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/saveArticle")
	public Article saveArticle(@RequestBody Article ar) {
		return rep.save(ar);
	}
	@GetMapping("/getAllArticles")
	public  List<Article> getAll(){
		return rep.findAll();
	}
	@GetMapping("/getAllByCat/{id}")
	public List<Article> getAllByCat(@PathVariable int id){
		List<Article> AllByCat=new ArrayList<Article>();
		for(Article cat :rep.findAll()) {
			if(cat.getId_ctg()==id) {
				AllByCat.add(cat);
			}
		}
		return AllByCat;
	}
}
