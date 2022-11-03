package Lieu;

import personnages.Chef;

import personnages.Gaulois;
import personnages.Romain;

public class Village {
	 private int nbVillageoisMaximum;
	 private String nom;
	 private Chef chef;
	 private Gaulois gaulois;
	 String [] villageois = new String[30];
	 int nbVillageois = 0;
	 

	 
	 public Village(String nom, int nbVillageoisMaximum) {
	   this.nom = nom;
	   this.nbVillageoisMaximum = nbVillageoisMaximum;
	 }

	public void setChef(Chef chef) {
	  this.chef = chef;
	}

	public String getNom() {
	  return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[this.nbVillageois] = gaulois.getNom();
		this.nbVillageois += 1;
	}
	

	public String trouverHabitant(int numero) {
		return villageois[numero - 1];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef.getNom() + " vivent les légendaires gaulois :\n"  );
		int i = 0;
		while(villageois[i] != null) {
			System.out.println("-"+villageois[i]);
			i ++ ;
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
        Chef chef = new Chef("Abraracourcix", 6, village);
        village.setChef(chef);
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);
        Gaulois oblelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(oblelix);
        village.afficherVillageois();
	}
}
