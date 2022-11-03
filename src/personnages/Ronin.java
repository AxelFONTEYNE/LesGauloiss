package personnages;

public class Ronin extends Humain {

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}
	private int honneur = 1;
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (2 * this.honneur >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			this.argent += adversaire.getArgent();
			adversaire.perdre();
			this.honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.argent);
			this.argent = 0;
			if (honneur > 0) {
				this.argent -= 1;
			}
		}
	}
	
	public void donner(Commercant beneficiaire) {
		int sommeDonnee = this.argent / 10;
		parler("" + beneficiaire.getNom() + " prend ces " + sommeDonnee + " sous.");
		beneficiaire.recevoir(sommeDonnee);
		this.argent = this.argent / 10;
	}

 	

}
