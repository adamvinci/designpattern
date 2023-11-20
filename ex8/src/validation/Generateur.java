package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;

public abstract class Generateur {
	private Generateur successeur;

	public Generateur(Generateur successeur) {
		this.successeur = successeur;
	}

	public boolean valider(String numero){
		if(successeur == null) return false;
		return successeur.valider(numero);
	}


	public abstract CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom);
}
