public class AmeliorationRobotCanon implements Robot{
private Robot robot;

public AmeliorationRobotCanon(Robot robot){
  this.robot=robot;
}

  @Override
  public int getCanon() {
    return robot.getCanon()*2;
  }

  @Override
  public int getShield() {
    return robot.getShield();
  }

  @Override
  public int getFreq() {
    return robot.getFreq();
  }

  @Override
  public String getName() {
    return robot.getName();
  }

  @Override
  public int diffLife(int i) {
    return robot.diffLife(i);
  }
}
