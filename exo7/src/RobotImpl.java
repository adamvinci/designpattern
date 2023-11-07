public class RobotImpl implements Robot {

  private int canon;
  private int shield;
  private int freq;
  private final String name;
  private int pvPoint;

  public RobotImpl(RobotBuilder robotBuilder) {
    if(robotBuilder.strategy != null){
      this.name = robotBuilder.name;
      this.canon = robotBuilder.strategy.getCanon();
      this.shield=robotBuilder.strategy.getShield();
      this.freq=robotBuilder.strategy.getFreq();
      this.pvPoint=robotBuilder.strategy.getPvPoints();
    }else {
      this.name = robotBuilder.name;
      this.canon = robotBuilder.canon;
      this.shield = robotBuilder.shield;
      this.freq = robotBuilder.freq;
      this.pvPoint = robotBuilder.pvPoint;

    }
  }

  @Override
  public int getCanon() {
    return canon;
  }

  @Override
  public int getShield() {
    return shield;
  }

  @Override
  public int getFreq() {
    return freq;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int diffLife(int i) {
    if(i!=0){
      pvPoint =pvPoint+ i;
    }

    return pvPoint;
  }

  public static class RobotBuilder {

    private int canon = 2;
    private int shield = 2;
    private int freq = 100;
    private final String name;
    private final int pvPoint=100;
    private RobotStrategy strategy;

    public RobotBuilder(String name) {
      this.name = name;
    }

    public RobotBuilder canon(int canon) {
      this.canon = canon;
      return this;
    }
  public RobotBuilder strategy(RobotStrategy strategy){
      this.strategy=strategy;
      return this;
  }
    public RobotBuilder shield(int shield) {
      this.shield = shield;
      return this;
    }

    public RobotBuilder freq(int freq) {
      this.freq = freq;
      return this;
    }

    public Robot build() {
      return new RobotImpl(this);
    }
  }
}
