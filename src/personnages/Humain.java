package personnages;

public abstract class Humain {
    protected String nom;
    protected String boisson;
    protected int argent;
    
    public Humain(String nom, String boisson, int argent) {
    	this.nom = nom;
    	this.boisson = boisson;
    	this.argent = argent;
    }
    
    public String getNom() {
    	return this.nom;
    }
    
    public int getArgent() {
    	return this.argent;
    }
    
   
    
    public void parler(String texte) {
        System.out.println( "(" + this.nom + ")" + " - " + texte + "");
    }
    
    public void direBonjour() {
    	parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boisson);
    }
    
    public void boire(String boisson) {
    	parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
    
    public void acheter(String bien, int prix) {
    	if(prix <= this.argent) {
    		parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
    		this.argent -= prix;
    	} else {
    		parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
    	}
    }
    
    public static void main(String[] args) {
    	Humain prof = new Humain("Prof", "kombucha", 54);
    	prof.direBonjour();
    	prof.acheter("une boisson", 12);
    	prof.boire("kombucha");
    	prof.acheter("un jeu", 2);
    	prof.acheter("un kimono", 50);
    }
    
}
