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
    return  (numero.length() == 14 && numero.startsWith("36"));

  }
  @Override
  public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
    return new DinersClub(numero,dateExpiration,nom);
  }

}
