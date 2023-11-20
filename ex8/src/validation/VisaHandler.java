package validation;

import domaine.CarteDeCredit;
import domaine.Visa;
import java.util.Calendar;

public class VisaHandler extends Generateur{
  public VisaHandler(Generateur successeur) {
    super(successeur);

  }

  @Override
  public boolean valider(String numero) {
    return  (numero.length() == 16 && numero.startsWith("4")) ;

  }
  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return new Visa(numero,dateExpiration,nom);
  }

}
