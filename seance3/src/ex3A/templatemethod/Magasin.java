package ex3A.templatemethod;

import java.util.HashMap;
import java.util.Map;


public abstract class Magasin{
	private Map<String,Produit> bac= new HashMap<String,Produit>();
	public void ajouterProduit(String name, int anneeDeParution){
		Produit product = this.createProduct(name, anneeDeParution);
		bac.put(name, product);
	}
	public Produit retourneProduit(String name){
		return bac.get(name);
	}
	protected abstract Produit createProduct(String name, int anneeDeParution);
}
