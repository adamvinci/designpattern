package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;
import java.util.Calendar;

public class MasterEuroCard extends Generateur{
  public MasterEuroCard(Generateur successeur) {
    super(successeur);

  }
    @Override
  public boolean valider(String numero) {
   return (numero.length() == 16 && numero.substring(0,2).matches("^(51|52|53|54|55)$"));
  }

  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return new MasterCard(numero,dateExpiration,nom);
  }

}
