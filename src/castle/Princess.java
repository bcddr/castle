package castle;

public class Princess extends Character {

	public Princess(Game game){
		super(game);
	}
	@Override
	public void print(){
		System.out.println("公主得了一种怪病，其实龙骨不一定能治好，你还要娶公主吗？");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	public void info(){
		System.out.println("公主：你真是一个勇敢充满智慧的年轻人，我愿意永远和你在一起！");
		System.out.println("Game Over！");
	}
	public int count(){
		return 5;
	}
	public void lieReply(){
		System.out.println("尽管你找到了这里，但我是不会喜欢一个骗子的，你还是回去吧！");
	}
}
