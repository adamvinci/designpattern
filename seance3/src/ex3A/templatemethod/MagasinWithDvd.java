package ex3A.templatemethod;

public class MagasinWithDvd extends Magasin{
    @Override
    protected Produit createProduct(String name, int anneeDeParution) {
        return new DVD(name,anneeDeParution);
    }
}
