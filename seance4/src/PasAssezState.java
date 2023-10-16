public class  PasAssezState extends State{


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
        machineACafe.setState(new Idle());
      else
        machineACafe.setState(new CollecteState());
    }else{
      machineACafe.afficherPasAssez(machineACafe.getBoisson());

    }




  }



}
