package castle;

public class Senior extends Character {

	public Senior(Game game){
		super(game);
	}
	@Override
	public void print(){
		System.out.println("�㿴��һ�����ߣ��Ƿ�ǰȥ�Ի���");
		System.out.println("��ѡ��yes�����ߡ�no��������Ϸ��");
	}
	public void info(){
		System.out.println("���ߣ���˵��ɱ���˶��ߣ������Ǹ������ĺ��ӡ�");
		System.out.println("�������up�ߣ�������Ӳ�ң����ϻ����õ�");
		System.out.println("");
	}	
	public int count(){
		return 2;
	}
	public void lieReply(){
		System.out.println("�������ȣ����ǳǱ�����ӭ���������ˣ��㻹�ǻ�ȥ�ɣ�");
	}
}
