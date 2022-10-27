package Lieu;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	 private String nom;
	 private Chef chef;
	 private Gaulois gaulois;
	 String [] villageois;
	 int nbVilageois = 0;
	 
	 void main() {
		Village("Village des irréductible", 30);
		
		
	 }
	 
	 public Village(String nom, int nbVillageoisMaximum) {
	   this.nom = nom;
	   this.villageois[nbVillageoisMaximum];
	 }

	public void setChef(Chef chef) {
	  this.chef = chef;
	}

	public String getNom() {
	  return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		addX(nbVillageaoisMaximum, this.villageaois, gaulois);
	}
	
	public String  trouverHabitant(int numero) {
		return villageois[numero];
	}
}
