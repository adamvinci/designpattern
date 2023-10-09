public abstract class State {

  public abstract void selectionneBoisson(MachineACafe machineACafe,ToucheBoisson toucheBoisson);

  public void entrerMonnaie(MachineACafe machineACafe,Piece piece){
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()+piece.getValeur());
    machineACafe.afficherMontant();
  }
  public void rendreMonnaie(MachineACafe machineACafe){
    machineACafe.afficherRetour();
    if(machineACafe.getBoisson()!=null){
      machineACafe.setBoisson(null);
    }
    machineACafe.setMontantEnCours(0);
    machineACafe.setState(new Idle());
  }

}
