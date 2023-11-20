package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import java.util.Calendar;

public class AmericanExpressHandler extends Generateur{

  public AmericanExpressHandler(Generateur successeur) {
    super(successeur);

  }

  @Override
  public boolean valider(String numero) {
    return (numero.length() == 15 && (numero.startsWith("37") || numero.startsWith("34")));

  }
  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return new AmEx(numero,dateExpiration,nom);
  }

}
