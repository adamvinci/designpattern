public class NombreMot implements Observer {

  private int nbMot = 0;

  @Override
  public void traiterLigne(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      nbMot++;
    }
  }
  public void printResult(){
    System.out.println("Il y avait " + nbMot + " mots.");
  }

}
