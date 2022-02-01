package net.h2.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	@Id
	@GeneratedValue
	private int id;
	private String libelle;
	private double prix;
	private int id_ctg;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String libelle, double prix, int id_ctg) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.id_ctg = id_ctg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getId_ctg() {
		return id_ctg;
	}
	public void setId_ctg(int id_ctg) {
		this.id_ctg = id_ctg;
	}
	
	

}
