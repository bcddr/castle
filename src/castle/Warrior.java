package castle;

public class Warrior extends Character {

	public Warrior(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(){
		System.out.println("�㿴��һ���佣�������ˣ��������Ƿ�Ը�������Ӳ��ȥ��ƺȡ�");
		System.out.println("��ѡ��yes�����ߡ�no��������Ϸ��");
	}
	public void info(){
		System.out.println("������ʿ�������Ǹ���ˬ�������ˣ����ǻʵ�һֱѰ�ҵ����ǣ�����ɡ�");
		System.out.println("������ʿ����up�����ߣ�����ҵ��ʵۣ��������������������һ��Ը���ġ�");
		System.out.println("");
	}
	public int count(){
		return 3;
	}
	public void lieReply(){
		System.out.println("������ʿ����������Ӳ�ң�������ƭ�����ˣ�����һ��������ȥ�ɣ�");
	}
}
