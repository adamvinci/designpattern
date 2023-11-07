public class Tank implements RobotStrategy {

  @Override
  public int getCanon() {
    return 5;
  }

  @Override
  public int getShield() {
    return 1;
  }

  @Override
  public int getFreq() {
    return 50;
  }
  public int getPvPoints(){
      return 300;
  }
}
