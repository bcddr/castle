package castle;

public class Emperor extends Character {


	public Emperor(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("国王：我亲爱的公主的了一种怪病，只有龙骨研磨成粉入药才能救她，你能帮到她吗？");
		System.out.println("请选择“yes”或者“no”继续游戏。");
	}
	public void info(){
		System.out.println("国王：真是太好了，你拯救了公主，我想她一定会爱上你的");
		System.out.println("国王：你可以选择向east方向走，那是她的寝宫。");
		System.out.println("");
	}
	public int count(){
		return 4;
	}
	public void lieReply(){
		System.out.println("国王：你根本没有龙骨，竟然欺骗本王，不要呆在我的城堡！");
	}
}
