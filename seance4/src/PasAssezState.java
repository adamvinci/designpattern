public class PasAssezState extends State{

  private int bouclePasAssez=0;

  @Override
  public void selectionneBoisson(MachineACafe machineACafe,ToucheBoisson toucheBoisson) {
    if(machineACafe.getBoisson()!=null && machineACafe.getBoisson() !=toucheBoisson ){
      throw new IllegalStateException();
    }
      machineACafe.setBoisson(toucheBoisson);
      machineACafe.afficherPasAssez(toucheBoisson);
  }

  @Override
  public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
    machineACafe.afficherMontant();
    if(machineACafe.getBoisson().getPrix()> machineACafe.getMontantEnCours()){//pas assez d'argent on redemande
      bouclePasAssez++;
      this.selectionneBoisson(machineACafe,machineACafe.getBoisson());
    }
    if(machineACafe.getBoisson().getPrix()<= machineACafe.getMontantEnCours()&& bouclePasAssez==0){//assez d'argent du premier coup
      machineACafe.setState(new CollecteState());
    }
    if(machineACafe.getBoisson().getPrix()<= machineACafe.getMontantEnCours()&& bouclePasAssez!=0){// il y'a assez d'argent plusieurs entrerMonnaie()
      State collecteState = new CollecteState();
      machineACafe.setState(collecteState);
      collecteState.selectionneBoisson(machineACafe,machineACafe.getBoisson());
      bouclePasAssez=0;
    }



  }



}
