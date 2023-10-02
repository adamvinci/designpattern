package ex3A;

public class MagasinWithLivre extends Magasin{
    @Override
    protected void ajouterProduit(String name, int anneeDeParution) {
        Livre livre=new Livre(name, anneeDeParution);
        bac.put(name,dvd);
    }
}
