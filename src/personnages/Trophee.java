package personnages;

public class Trophee {
    private Gaulois gaulois;
    private Equipement equipement;
    
    public Trophee(Gaulois gaulois, Equipement equipement) {
    	this.gaulois = gaulois;
    	this.equipement = equipement;
    }
    
    public Gaulois getGaulois() {
    	return this.gaulois;
    }
    
    public Equipement getEquipement() {
    	return this.equipement;
    }
    
    public String donnerNom() {
    	return this.gaulois.getNom();
    }
}
