public abstract class State {

    public abstract void selectionneBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson);

    public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {
        machineACafe.setState(new CollecteState());

    }

    public void rendreMonnaie(MachineACafe machineACafe) {
        machineACafe.afficherRetour();
        machineACafe.setBoisson(null);
        machineACafe.setMontantEnCours(0);
        machineACafe.setState(new Idle());
    }
}
