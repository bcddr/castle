package castle;

public class Monster extends Character{

	public Monster(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("�㿴��һ��С������·�߿���");
		System.out.println("�������Ƿ�Ը������û����ϵķ��ݣ�");
		System.out.println("��ѡ��yes�����ߡ�no��������Ϸ��");
	}
	@Override
	public void info(){
		System.out.println("�ûط��ݵ�С����лл�����ң�������������ҵ������������ѡ����east������");
		System.out.println("");
	}
	@Override
	public int count(){
		return 1;
	}
	@Override
	public void lieReply(){
	}

}
