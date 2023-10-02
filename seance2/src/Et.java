import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Et implements Strategy{
    private Strategy[] strategies;


  public Et(Strategy...strategie) {
    this.strategies = strategie;
  } // ou mettre un spread operator (Object ...s)

  @Override
  public boolean imprimerSi(String mot)    {
    for (Strategy strategy : strategies) {
      if (!strategy.imprimerSi(mot)) {
        return false;
      }
    }

    return true; //si le mot respecte toute les strategies il est print
  }



}


