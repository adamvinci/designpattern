package ex3A;

public class MagasinWithDvd extends Magasin{
    @Override
    protected void ajouterProduit(String name, int anneeDeParution) {
        DVD dvd=new DVD(name, anneeDeParution);
        bac.put(name,dvd);
    }
}
