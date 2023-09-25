import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ou implements Strategy {

  private List<Strategy> strategies;
  private Visitor visitor;

  public Ou(List<Strategy> strategie, Visitor visitor) {
    this.strategies = strategie;
    this.visitor = visitor;
  }

  @Override
  public boolean imprimerSi(String mot) throws IOException {
    for (Strategy strategy : strategies) {
      if (strategy.imprimerSi(mot)) {
        visitor.visit(this);
        return true;
      }
    }

    return false; //si le mot respecte une des  strategies il est print
  }


}


