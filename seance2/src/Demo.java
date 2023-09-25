import java.io.IOException;
import java.util.ArrayList;

public class Demo {

  public static void main(String[] args) throws IOException {
    ListerMots listerMots = new ListerMots("seance2/src/input.txt");

    Strategy strategyAnd = new And(new StrategyPalindrome(), new StrategyCommencePar('B'));
    Strategy strategyOr = new Or(new StrategyPalindrome(), new StrategyCommencePar('B'));
    Strategy strategyNot = new Not(new StrategyCommencePar('B'));
    listerMots.imprimerSiCommenceParT(strategyAnd);

    System.out.println(
        "---------------------------------ET---------------------------------------------");
    Visitor visitorET = new Compteur();
    ArrayList<Strategy> strategies = new ArrayList<Strategy>();
    strategies.add(new StrategyCommencePar('B'));
    // strategies.add(new StrategyPalindrome(visitor));
    strategies.add(new StrageyLongueur(7));
    Strategy et = new Et(strategies,visitorET);
    listerMots.imprimerSiCommenceParT(et);
    visitorET.printCmpt();

    System.out.println(
        "---------------------------------Ou---------------------------------------------");
    Visitor visitorOU = new Compteur();
    ArrayList<Strategy> strategiesOu = new ArrayList<Strategy>();
    strategiesOu.add(new StrategyCommencePar('B'));
    // strategies.add(new StrategyPalindrome(visitor));
    strategiesOu.add(new StrageyLongueur(7));
    Strategy ou = new Ou(strategiesOu,visitorOU);
    listerMots.imprimerSiCommenceParT(ou);
   visitorOU.printCmpt();
  }
}
