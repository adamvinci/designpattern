package ex3A;

import java.util.HashMap;
import java.util.Map;


public abstract class Magasin {
	private Map<String,Produit> bac= new HashMap<String,Produit>();
	protected abstract void ajouterProduit(String name, int anneeDeParution);
	public Produit retourneDVD(String name){
		return bac.get(name);
	}
}
