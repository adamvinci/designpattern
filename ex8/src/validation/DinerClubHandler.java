package validation;

import domaine.CarteDeCredit;
import domaine.DinersClub;
import java.util.Calendar;

public class DinerClubHandler extends Generateur{

  public DinerClubHandler(Generateur successeur) {
    super(successeur);

  }

  @Override
  public boolean valider(String numero) {
    if (numero.length() == 14 && numero.startsWith("36")) return true;
    return super.valider(numero);

  }
  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return new DinersClub(numero,dateExpiration,nom);
  }

}
