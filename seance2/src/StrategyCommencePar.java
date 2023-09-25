public class StrategyCommencePar implements Strategy {
	private char lettre;
	public StrategyCommencePar(char lettre) {
		this.lettre = lettre;
	}

	@Override
	public boolean imprimerSi(String s) {
		 return s.charAt(0)==lettre;

	}




}
