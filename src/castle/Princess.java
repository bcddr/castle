package castle;

public class Princess extends Character {

	public Princess(Game game){
		super(game);
	}
	@Override
	public void print(){
		System.out.println("��������һ�ֲֹ�����ʵ���ǲ�һ�����κã��㻹ҪȢ������");
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
		System.out.println("�������ҵ�����������ǲ���ϲ��һ��ƭ�ӵģ��㻹�ǻ�ȥ�ɣ�");
	}
}
