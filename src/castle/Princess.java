package castle;

public class Princess extends Character {


	public Princess(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("����������ֻ�Ǵ�˵���ҵĲ���һ����ã��㻹��Ը�������һ����");
		System.out.println("��ѡ��yes�����ߡ�no��������Ϸ��");
	}
	public void info(){
		System.out.println("������������һ���¸ҳ����ǻ۵������ˣ���Ը����Զ������һ��");
		System.out.println("Game Over��");
	}
	public int count(){
		return 5;
	}
	public void lieReply(){
		System.out.println("�������������ҵ�����������ǲ���ϲ��һ��ƭ�ӵģ��㻹�ǻ�ȥ�ɣ�");
	}
}
