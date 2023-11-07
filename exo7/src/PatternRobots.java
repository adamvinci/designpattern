import static java.lang.System.exit;

public class PatternRobots {
	
	public static void fight(Robot robot1, Robot robot2) {
		int tick1=robot1.getFreq();
		int tick2=robot2.getFreq();
		while(robot2.diffLife(0)>0 && robot1.diffLife(0)>0) {
			int tick=Math.min(tick1, tick2);

			tick1-=tick;
			tick2-=tick;


			if (tick1==0) {// robot 1 feu
				tick1=shoot(robot1,robot2);
			}
			if (tick2==0) {// robot 2 feu
				tick2=shoot(robot2,robot1);


			}
		}
	}
	
	private static int shoot(Robot robot1, Robot robot2) {
		int dmg=Math.max(0,robot1.getCanon()-robot2.getShield());

		int lost=robot2.diffLife(0)-robot2.diffLife(-dmg);
		System.out.println(robot1.getName()+" shoots for "+lost);
		if (robot2.diffLife(0)<=0) {
			System.out.println("Kabooom "+robot2.getName());
		}
		return robot1.getFreq();
	}
	
	public static void main(String[] args) {
		Robot robot1= new AmeliorationRobotCanon(new RobotImpl.RobotBuilder("robot1").canon(10).shield(2).build());
		Robot robot2= new AmeliorationRobotPv(new AmeliorationRobotShield(new RobotImpl.RobotBuilder("robot2").canon(9).shield(3).freq(90).build()));// un robot avec un
		Robot robot3=new RobotImpl.RobotBuilder("tank").strategy(new Tank()).build();
		Robot robot4=new RobotImpl.RobotBuilder("berta").strategy(new GrosseBerta()).canon(6).build();
		System.out.println(robot3.diffLife(0));
		fight(robot1, robot2);
	}
}
