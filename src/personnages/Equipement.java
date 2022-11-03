package personnages;

public enum Equipement {
    CASQUE("casque"), BOUCLIER("bouclier");
    
	private String nom;
	
	Equipement(String nom){
		this.nom = nom;
	}
	public String toString() {
		return this.nom;
	}
	
	public static void main(String[] args) {
		System.out.println(BOUCLIER.toString());
		
	}
}
