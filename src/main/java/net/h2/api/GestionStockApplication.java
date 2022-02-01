package net.h2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.h2.api.dao.ArticleRepository;
import net.h2.api.dao.CategorieRepository;
import net.h2.api.model.Article;
import net.h2.api.model.Categorie;
@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner {
	@Autowired
	private  CategorieRepository rep;
	@Autowired
	private  ArticleRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie a=new Categorie("Alimentation");
		Categorie b=new Categorie("Vetement");
		Categorie c=new Categorie("Sportif");
		rep.save(a);
		rep.save(b);
		rep.save(c);
		Article d=new Article("lait",3.5,1);
		Article e=new Article("avocat ",9.0,1);
		Article f=new Article("manga",8.5,1);
		Article g=new Article("pantalon",300.0,2);
		Article h=new Article("chemise",250.0,2);
		Article k=new Article("chaussures ",500.0,3);
		Article l=new Article("vélo",2000.0,3);
		repo.save(d);
		repo.save(e);
		repo.save(f);
		repo.save(g);
		repo.save(h);
		repo.save(k);
		repo.save(l);		
	}

}
