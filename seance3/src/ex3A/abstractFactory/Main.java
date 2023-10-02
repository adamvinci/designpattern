package ex3A.abstractFactory;


public class Main {

  public static void main(String[] args) {
    Magasin magasinDVD = new Magasin();
    magasinDVD.ajouterProduit("dvd1",2000,new DVDStrategy());
    magasinDVD.ajouterProduit("dvd2",2000,new DVDStrategy());
    System.out.println(magasinDVD.retourneProduit("dvd1").getPrix());

    Magasin magasinLivre = new Magasin();
    magasinLivre.ajouterProduit("livre1",2000,new LivreStrategy());
    magasinLivre.ajouterProduit("livre2",2000,new LivreStrategy());
    System.out.println(magasinLivre.retourneProduit("livre1").getPrix());
  }

}
