package castle;

public class Senior extends Character {

	public Senior(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("你看到一个老者，是否前去对话？");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	public void info(){
		System.out.println("老者：听说你帮小汤姆拿回了风筝，你真是个有爱心的孩子。");
		System.out.println("老者：你可以向up走，这是两硬币，拿上会有用的");
		System.out.println("");
	}	
	public int count(){
		return 2;
	}
	public void lieReply(){
		System.out.println("老者：没有一点恻隐之心，我们城堡不欢迎你这样的人，你还是回去吧！");
	}
}
