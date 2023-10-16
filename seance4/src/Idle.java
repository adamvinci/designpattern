public class Idle extends State{

  @Override
  public void selectionneBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
    machineACafe.afficherPasAssez(toucheBoisson);
  }

  public void rendreMonnaie(MachineACafe machineACafe){


  }
}
