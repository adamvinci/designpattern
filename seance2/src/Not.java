import java.io.IOException;

public class Not implements Strategy {
  private final Strategy strategie1;
  public Not(Strategy strategie1) {
    this.strategie1 = strategie1;
  }

  @Override
  public boolean imprimerSi(String mot) throws IOException {
    return !strategie1.imprimerSi(mot);
  }


}
