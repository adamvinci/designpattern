public class CollecteState extends State{

  @Override
  public void selectionneBoisson(MachineACafe machineACafe ,ToucheBoisson toucheBoisson) {
    if (toucheBoisson.getPrix() > machineACafe.getMontantEnCours()) {
      machineACafe.setBoisson(toucheBoisson);
      machineACafe.afficherPasAssez(toucheBoisson);
      machineACafe.setState(new PasAssezState());
    }
    machineACafe.setMontantEnCours(machineACafe.getMontantEnCours()-toucheBoisson.getPrix());
    machineACafe.afficherBoisson(toucheBoisson);
    machineACafe.afficherMontant();
    machineACafe.setBoisson(null);
    if (machineACafe.getMontantEnCours() == 0)
      machineACafe.setState(new Idle());
  }



}
