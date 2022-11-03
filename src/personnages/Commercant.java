package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		int argentPris = this.argent;
		this.argent = 0;
		return argentPris;
	}
    
	public void recevoir(int somme) {
		parler("" + somme + " sous ! Je te remercie généreux donateur!");
		this.argent += somme;
	}
}
