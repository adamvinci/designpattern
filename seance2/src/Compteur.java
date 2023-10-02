import java.io.IOException;

public class Compteur implements Strategy {

    private final Strategy strategy;
    private int cmpt;

    public Compteur(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean imprimerSi(String s) {
        if (strategy.imprimerSi(s)) {
            cmpt++;
            return true;
        }
        return false;
    }

    public void printCmpt() {
        System.out.println("Nombre de mot total " + cmpt);
    }
}
