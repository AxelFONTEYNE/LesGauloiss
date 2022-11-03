package personnages;



public class Gaulois {
	private String nom;
    private int effetPotion = 1;
    private int force, nb_trophees;
    private Equipement trophees[] = new Equipement[100];
  
    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }
//    
//    public int getnb_trophees() {
//    	return nb_trophees;
//    }
//    
//    public Equipement[] getTrophees() {
//    	return trophees;
//    }

    public int geteffetPotion() {
        return effetPotion;
    }
    
    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + " " + texte + "");
    }

//    private String prendreParole() {
//        return "Le gaulois " + nom + " : ";
//    }

    private String prendreParole() {
    	String texte = "Le gaulois " + nom + " : ";
    	return texte;
    }

//    public void frapper(Romain romain) {
//       System.out.println(nom + " envoie un grand coup dans la mâchoire de "
//      + romain.getNom());
//       romain.recevoirCoup(force / 3 * effetPotion);
//    
//    }

    public void frapper(Romain romain) {
    	System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
    	Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
    	for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
    	    this.trophees[nb_trophees] = trophees[i];
    	}
    	return;
    }
    
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";

	}
	
	public void boirePotion(int potion) {
		effetPotion = potion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");
	}
	
	public void faireUneDonnation(Musee musee) {
		parler("Je donne au musee tous mes trophées");
		for(int i = 0; i < this.nb_trophees; i++) {
			System.out.println("-"+trophees[i].toString());
			this.trophees[i] = null;
		}
		musee.donnerTrophee(this);
		this.nb_trophees = 0;
	}
	
	public static void main(String[] args) {
		Gaulois asterix =  new Gaulois ("Astérix", 8);
		Romain connard = new Romain("Connard", 8);
		System.out.println(asterix.getNom());
		asterix.parler("Ton père le marsouin");
		asterix.frapper(connard);
		asterix.boirePotion(7);
	}

}



