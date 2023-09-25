import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        ListerMots listerMots = new ListerMots("seance2/src/input.txt");
        listerMots.imprimerSiCommenceParT(new StrategyCommencePar('b'));
        listerMots.imprimerSiCommenceParT(new StrageyLongueur(4));
        listerMots.imprimerSiCommenceParT(new StrategyPalindrome());
    }
}
