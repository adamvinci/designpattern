public class MachineACafe {

	private int montantEnCours = 0;
	private State etatCourant ;
	private ToucheBoisson boisson = null;

	public MachineACafe() {
		setState(new Idle());
	}

	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}
	public void setState(State state){
		this.etatCourant = state;
	}
	public void entrerMonnaie(Piece piece) {
		montantEnCours += piece.getValeur();
		afficherMontant();
		etatCourant.entrerMonnaie(this,piece);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		etatCourant.selectionneBoisson(this,toucheBoisson);
		}
	
	public void rendreMonnaie() {
		etatCourant.rendreMonnaie(this);

	}
	public int getMontantEnCours(){
		return montantEnCours;
	}
	public void setMontantEnCours(int montantEnCours){
		this.montantEnCours=montantEnCours;
	}
	public void setBoisson(ToucheBoisson boisson){
		this.boisson=boisson;
	}
	public ToucheBoisson getBoisson(){
		return boisson;
	}
}
