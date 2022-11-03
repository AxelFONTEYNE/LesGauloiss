package Scenario;

import personnages.Commercant;

import personnages.Yakuza;

import personnages.Ronin;

public class HistoireTP4 {
    public static void main(String[] args) {
    	Commercant marco = new Commercant("Marco", "thé", 30);
    	
//    	marco.direBonjour();
//    	marco.seFaireExtorquer();
//    	marco.recevoir(15);
//    	marco.boire("thé");
    	
    	Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");    	
//    	yaku.direBonjour();
//    	yaku.extorquer(marco);
    	
    	Ronin roro = new Ronin("Roro", "shochu", 54);
    	
    	roro.provoquer(yaku);
    }
}
