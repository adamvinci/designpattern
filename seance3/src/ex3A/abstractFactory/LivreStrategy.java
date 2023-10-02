package ex3A.abstractFactory;

public class LivreStrategy implements AbstractFactory{
    @Override
    public Produit createProduct(String name, int anneeDeParution) {
        return new Livre(name,anneeDeParution);
    }
}
