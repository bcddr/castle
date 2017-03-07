package castle;

public class Senior extends Character {

	public Senior(Game game){
		super(game);
	}
	@Override
	public void print(){
		System.out.println("你看到一个老者，是否前去对话？");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	public void info(){
		System.out.println("老者：听说你杀死了毒蛇，你真是个善良的孩子。");
		System.out.println("你可以向up走，这是两硬币，拿上会有用的");
		System.out.println("");
	}	
	public int count(){
		return 2;
	}
	public void lieReply(){
		System.out.println("见死不救，我们城堡不欢迎你这样的人，你还是回去吧！");
	}
}
