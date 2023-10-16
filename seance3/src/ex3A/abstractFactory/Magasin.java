package ex3A.abstractFactory;


import java.util.HashMap;
import java.util.Map;


public  class Magasin{
	private Map<String,Produit> bac= new HashMap<String,Produit>();
	//mettre abstractfactory en parametre pour bien dire qu'il y'a un magasin de livre et un magasin de dvd pck la il peux vendre les 2
	public void ajouterProduit(String name, int anneeDeParution,AbstractFactory abstractFactory){
		Produit product = abstractFactory.createProduct(name, anneeDeParution);
		bac.put(name, product);
	}
	public Produit retourneProduit(String name){
		return bac.get(name);
	}

}
