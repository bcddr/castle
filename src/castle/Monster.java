package castle;

public class Monster extends Character{

	public Monster(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("�㿴��һ��С���������� һ�����ߵĹ������Ƿ���а�����");
		System.out.println("��ѡ��yes�����ߡ�no��������Ϸ��");
	}
	public void info(){
		System.out.println("�����ȵ�С����лл�����ң�������������ҵ������������ѡ����east������");
		System.out.println("");
	}
	public int count(){
		return 1;
	}
	public void lieReply(){
	}

}
