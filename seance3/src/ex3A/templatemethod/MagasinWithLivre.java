package ex3A.templatemethod;

public class MagasinWithLivre extends Magasin{
    @Override
    protected Produit createProduct(String name, int anneeDeParution) {
        return new Livre(name,anneeDeParution);
    }
}
