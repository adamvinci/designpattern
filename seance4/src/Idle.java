public class Idle extends State{

  @Override
  public void selectionneBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
    if(toucheBoisson.getPrix()>machineACafe.getMontantEnCours()){

      State pasAssezState = new PasAssezState();
      machineACafe.setState(pasAssezState);
      pasAssezState.selectionneBoisson(machineACafe,toucheBoisson);
    }else{
      State collecteState = new CollecteState();
      machineACafe.setState(collecteState);
      collecteState.selectionneBoisson(machineACafe,toucheBoisson);
    }
  }


}
