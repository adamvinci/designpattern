import java.io.IOException;


public class And implements Strategy {
    private final Strategy strategie1;
    private final Strategy strategie2;

    public And(Strategy strategie1, Strategy strategie2) {
        this.strategie1 = strategie1;
        this.strategie2 = strategie2;
    }

    @Override
    public boolean imprimerSi(String mot) {
        return strategie1.imprimerSi(mot) && strategie2.imprimerSi(mot);
    }


}
