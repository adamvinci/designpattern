import java.io.IOException;

  public class Or implements Strategy{
    private final Strategy strategie1;
    private final Strategy strategie2;
    public Or(Strategy strategie1,Strategy strategie2) {
      this.strategie1 = strategie1;
      this.strategie2=strategie2;
    }

    @Override
    public boolean imprimerSi(String mot) throws IOException {
      return strategie1.imprimerSi(mot) || strategie2.imprimerSi(mot);
    }



  }

