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

    Strategy et = new Et(new StrategyCommencePar('B'),new StrageyLongueur(7));
    Compteur decorator1=new Compteur(et);
    listerMots.imprimerSiCommenceParT(decorator1);
    decorator1.printCmpt();


    System.out.println(
        "---------------------------------Ou---------------------------------------------");
    Strategy ou = new Ou(new StrategyCommencePar('B'),new StrageyLongueur(7));
    Compteur decorator2=new Compteur(ou);
    listerMots.imprimerSiCommenceParT(decorator2);//mettre decorator et pas strategy
    decorator2.printCmpt();
  }
}
