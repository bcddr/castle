package castle;

public class Monster extends Character{

	public Monster(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("你看到一个小孩正在遭受 一个毒蛇的攻击，是否进行帮助？");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	public void info(){
		System.out.println("被拯救的小孩：谢谢救了我，如果你想更快的找到公主，你可以选择向east方向走");
		System.out.println("");
	}
	public int count(){
		return 1;
	}
	public void lieReply(){
	}

}
