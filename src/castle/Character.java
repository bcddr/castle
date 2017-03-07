package castle;

public class Character{
	protected Game game;
	public Character(Game game){
		this.game=game;
	}
	public void print(){
//		System.out.println("");
	}
	public void info(){
	}
	public int count(){
		return 0;
	}
	public void lieReply(){
		
	}	
	public void reply(){
		System.out.println("亲爱地年轻人，祝你好运");
	}
}
