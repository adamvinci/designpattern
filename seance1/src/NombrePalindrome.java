public class NombrePalindrome implements Observer {

  private int  nbrPalindromes = 0;
  @Override
  public void traiterLigne(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      StringBuffer temp = new StringBuffer(mot);
      if (mot.equals(temp.reverse().toString())) {
        nbrPalindromes++;
      }
    }
  }

  public void printResult(){
    System.out.println("Il y avait " + nbrPalindromes + " palindromes.");
  }
}
