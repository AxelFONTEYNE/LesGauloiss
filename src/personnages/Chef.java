package personnages;

import Lieu.Village ;

public class Chef {
	private String nom;
    private int force;
    private int effetPotion = 1;
    private Village village;

    public Chef(String nom, int force, Village village) {
        this.nom = nom;
        this.force = force;
        this.effetPotion = effetPotion;
        this.village = village;
    }
    
    public String getNom() {
    	return this.nom;
    }
}