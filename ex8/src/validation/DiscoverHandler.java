package validation;

import domaine.CarteDeCredit;
import domaine.Discover;
import java.util.Calendar;

public class DiscoverHandler extends Generateur{
  public DiscoverHandler(Generateur successeur) {
    super(successeur);

  }


  @Override
  public boolean valider(String numero) {
    if (numero.length() == 16 && (numero.startsWith("6011") || numero.startsWith("65"))) {
      return true;
    } else {
      return super.valider(numero);
    }
  }

  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return new Discover(numero,dateExpiration,nom);
  }


}
