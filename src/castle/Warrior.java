package castle;

public class Warrior extends Character {

	public Warrior(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("你看到一个配剑的中年人，他问你是否愿意给他两硬币去买酒喝。");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	public void info(){
		System.out.println("屠龙勇士：你真是个豪爽的年轻人，这是皇帝一直寻找的龙骨，给你吧。");
		System.out.println("屠龙勇士：向up方向走，你会找到皇帝，给他龙骨他会满足你的一个愿望的。");
		System.out.println("");
	}
	public int count(){
		return 3;
	}
	public void lieReply(){
		System.out.println("屠龙勇士：你哪来的硬币，竟敢欺骗本大人，饶你一命，滚回去吧！");
	}
}
