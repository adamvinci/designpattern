package ex3A.abstractFactory;


import java.util.HashMap;
import java.util.Map;


public  class Magasin{
	private Map<String,Produit> bac= new HashMap<String,Produit>();
	public void ajouterProduit(String name, int anneeDeParution,AbstractFactory abstractFactory){
		Produit product = abstractFactory.createProduct(name, anneeDeParution);
		bac.put(name, product);
	}
	public Produit retourneProduit(String name){
		return bac.get(name);
	}

}
