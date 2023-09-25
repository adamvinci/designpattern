public class Compteur implements Visitor {
  private int cmpt;
  public void printCmpt(){
    System.out.println("Nombre de mot accepte : "+cmpt);
  }
  @Override
  public void visit(Strategy strategy) {
    cmpt++;
  }

}
