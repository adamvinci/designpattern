public class StrageyLongueur implements Strategy{
	private int longeur;

	public StrageyLongueur(int longeur) {
		this.longeur = longeur;
	}


	@Override
	public boolean imprimerSi(String s) {
		return s.length() == longeur;
	}
}
