package castle;

public class Monster extends Character{

	public Monster(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("你看到一个小孩正在路边哭泣");
		System.out.println("他问你是否愿意帮他拿回树上的风筝？");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	@Override
	public void info(){
		System.out.println("拿回风筝的小孩：谢谢救了我，如果你想更快的找到公主，你可以选择向east方向走");
		System.out.println("");
	}
	@Override
	public int count(){
		return 1;
	}
	@Override
	public void lieReply(){
	}

}
