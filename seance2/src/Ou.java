import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ou implements Strategy {

  private Strategy[] strategies;


  public Ou(Strategy... strategie ) {
    this.strategies = strategie;

  }

  @Override
  public boolean imprimerSi(String mot)  {
    for (Strategy strategy : strategies) {
      if (strategy.imprimerSi(mot)) {
        return true;
      }
    }

    return false; //si le mot respecte une des  strategies il est print
  }


}


