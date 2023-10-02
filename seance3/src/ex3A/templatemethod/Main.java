package ex3A.templatemethod;
public class Main {

  public static void main(String[] args) {
    Magasin magasinDVD = new MagasinWithDvd();
    magasinDVD.ajouterProduit("dvd1",2000);
    magasinDVD.ajouterProduit("dvd2",2000);
    System.out.println(magasinDVD.retourneProduit("dvd1").getPrix());

    Magasin magasinLivre = new MagasinWithLivre();
    magasinLivre.ajouterProduit("livre1",2000);
    magasinLivre.ajouterProduit("livre2",2000);
    System.out.println(magasinLivre.retourneProduit("livre1").getPrix());
  }

}
