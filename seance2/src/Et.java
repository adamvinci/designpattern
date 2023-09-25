import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Et implements Strategy{
    private List<Strategy> strategies;
  private Visitor visitor;
  public Et(List<Strategy> strategie,Visitor visitor) {
    this.strategies = strategie;
    this.visitor = visitor;
  }

  @Override
  public boolean imprimerSi(String mot) throws  IOException {
    for (Strategy strategy : strategies) {
      if (!strategy.imprimerSi(mot)) {
        return false;
      }
    }
    visitor.visit(this);
    return true; //si le mot respecte toute les strategies il est print
  }


}


