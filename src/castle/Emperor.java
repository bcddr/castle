package castle;

public class Emperor extends Character {


	public Emperor(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("�ʵۣ����װ��Ĺ�������һ�ֲֹ���ֻ��������ĥ�ɷ���ҩ���ܾ��������ܰﵽ����");
		System.out.println("��ѡ��yes�����ߡ�no��������Ϸ��");
	}
	public void info(){
		System.out.println("����̫���ˣ��������˹�����������һ���ᰮ�����");
		System.out.println("�����ѡ����east������");
		System.out.println("");
	}
	public int count(){
		return 4;
	}
	public void lieReply(){
		System.out.println("�������㶼����ƭ����Ҫ�����ҵĳǱ���");
	}
}
