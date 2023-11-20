package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;

public abstract class Generateur {
	private Generateur successeur;

	public Generateur(Generateur successeur) {
		this.successeur = successeur;
	}
	public CarteDeCredit validerAndCreate(String numero, Calendar dateExpiration, String nom) {
		if (valider(numero)) {
			return creerCarte(numero, dateExpiration, nom);
		} else if (successeur != null) {
			return successeur.validerAndCreate(numero, dateExpiration, nom);
		} else {
			return null;  // or throw an exception if needed
		}
	}

	public abstract boolean valider(String numero);

	public abstract CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom);
}
