public class MachineACafe {
	public enum State{
		PAS_ASSEZ{
			@Override
			public void selectionneBoisson(MachineACafe machineACafe,ToucheBoisson toucheBoisson) {
				if(machineACafe.getBoisson()!=null && machineACafe.getBoisson() !=toucheBoisson ){
					throw new IllegalStateException();
				}
			}

			@Override
			public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
				if(machineACafe.getBoisson().getPrix()<= machineACafe.getMontantEnCours()){

					machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-machineACafe.getBoisson().getPrix());
					machineACafe.afficherBoisson(machineACafe.getBoisson());
					machineACafe.setBoisson(null);
					machineACafe.afficherMontant();
					if (machineACafe.getMontantEnCours() == 0)
						machineACafe.setState(IDLE);
					else
						machineACafe.setState(COLLECTE);
				}else{
					machineACafe.afficherPasAssez(machineACafe.getBoisson());

				}




			}
		},COLLECTE{
			@Override
			public void selectionneBoisson(MachineACafe machineACafe ,ToucheBoisson toucheBoisson) {
				if (toucheBoisson.getPrix() > machineACafe.getMontantEnCours()) {
					machineACafe.setBoisson(toucheBoisson);
					machineACafe.afficherPasAssez(toucheBoisson);
					machineACafe.setState(PAS_ASSEZ);
					return;
				}
				machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-toucheBoisson.getPrix());
				machineACafe.afficherBoisson(toucheBoisson);
				machineACafe.afficherMontant();
				machineACafe.setBoisson(null);
				if (machineACafe.getMontantEnCours() == 0)
					machineACafe.setState(IDLE);
			}
		},IDLE{
			@Override
		public void selectionneBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
			machineACafe.afficherPasAssez(toucheBoisson);
		}

			public void rendreMonnaie(MachineACafe machineACafe){


			}};
		public abstract void selectionneBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson);

		public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
			machineACafe.setState(COLLECTE);

		}

		public void rendreMonnaie(MachineACafe machineACafe) {
			machineACafe.afficherRetour();
			machineACafe.setBoisson(null);
			machineACafe.setMontantEnCours(0);
			machineACafe.setState(IDLE);
		}
	}
	private int montantEnCours = 0;
	private State etatCourant ;
	private ToucheBoisson boisson = null;

	public MachineACafe() {
		setState(State.COLLECTE);
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
