public class NombreOccurenceMotParLigne implements Observer {

  private String mot;

  public NombreOccurenceMotParLigne(String mot) {
    this.mot = mot;
  }

  private int nbOccurences =0;
  @Override
  public void traiterLigne(String ligne) {
    if (ligne.contains(mot)) {
      nbOccurences++;
    }
  }

  public void printResult(){
    System.out.println("Il y avait " + nbOccurences + " lignes contenant Belgique.");
  }
}
