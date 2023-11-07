public class AmeliorationRobotPv implements Robot{
  private Robot robot;

  public AmeliorationRobotPv(Robot robot){
    this.robot=robot;
  }

  @Override
  public int getCanon() {
    return robot.getCanon();
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
    if(i>0){
      return robot.diffLife((i/2));
    }
    return robot.diffLife(i);
  }
}
