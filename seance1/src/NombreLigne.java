public class NombreLigne implements Observer {
  private int nbLignes =0;
  @Override
  public void traiterLigne(String ligne) {
  nbLignes++;
  }

  public void printResult(){
    System.out.println("Il y avait " + nbLignes + " lignes.");
  }
}
