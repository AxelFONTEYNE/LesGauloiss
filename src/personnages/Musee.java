package personnages;

public class Musee {
    private Trophee etagere[] = new Trophee[200];
    private int nbTrophee = 0;
    
    public void donnerTrophee(Gaulois gaulois) {
    	Trophee
    	this.etagere[nbTrophee] = getEquipement()
    	this.nbTrophee += 1;
    	
    	
    	
    	for(int i = 0; i < gaulois.getnb_trophees(); i++) {
    		this.nbTrophee += 1;
        	this.etagere[nbTrophee] = gaulois.getEquipement();
    	}
    }
}
