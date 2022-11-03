package personnages;

public class Yakuza extends Humain{

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	private int reputation = 3;
	private String clan = "";
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + this.nom + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		this.argent += gain;
		this.reputation += 1;
	}
	
	public void perdre() {
		parler("J’ai perdu mon duel et mes " + this.argent + " sous, snif... J'ai déshonoré le clan de " + this.clan + ".");
		this.argent = 0;
		if (this.reputation > 0){
		    this.reputation -= 1;
		}
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler("" + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int somme = victime.seFaireExtorquer();
		this.argent += somme;
		parler("J’ai piqué les " + somme + " sous de " + victime.getNom() + ", ce qui me fait " + this.argent + " sous dans ma poche. Hi ! Hi !");
	    this.reputation += 1;
	}

	
}