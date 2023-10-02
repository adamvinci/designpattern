package ex3A.abstractFactory;


public class DVDStrategy implements AbstractFactory{

    @Override
    public Produit createProduct(String name, int anneeDeParution) {
        return new DVD(name,anneeDeParution);
    }
}
