
public class Second extends First {
	//�ƹ��͵� ���������!
	//��ӹ��� First Ŭ������ ����� ��������
	
	int b;
	
	
	//������!!!! = > ���� �Ʒ�, �޼ҵ� ����.
	//��ü ������(new)�� �� �ڵ����� ȣ��Ǵ� �޼ҵ�! = �� �� ��
	
	public 
	
	
	
	
	
	
	//���� ��������� ����ϴ� ��� �޼ҵ�
	
	void showSecond() {
		System.out.println("b: "+ b);	
		
	}
	
	
	//�������� ������ FirstŬ������ a �������� ������ִ� ��ɸ޼ҵ�
	
	void show() {
//		System.out.println("a: ");
		
		//?? ��ü����=�ڱ� ������ �ڱⰡ ����.
		//Second���� First�� ��������ϴ� ����  ��ü������ �ƴ�!
		
		showFirst(); //FirstŬ������ ����޼ҵ带 �����ξ� ȣ��
		
		System.out.println("b: "+ b); //���θ���� ���� �������.
		
	}
	
	
	
	//��������� ���� �������ִ� �޼ҵ�
	
	void setMembers(int a, int b) {
		//��������� ���޹��� �Ű������� �� ����!
//		this.a= a; //��? �̰�??
		//this. �� ���ΰ�ü�� ��Ī
		//a�� Second�� ������ �ƴ� First��.
		
		//���������� First ���� a��� ǥ���� ����.
		
		//���� ��ü�� ���̶�� ǥ���� ���� Ű����! (��������!)
		//this. Ű����� ������ ǥ��: super
		
//		super.a= a; //��.. �׷��� �̰� �� �ǰ�? ���̰� ����? First���� ����!!!
		
		super.setA(a); // = setA(a); -> a�� �޾� ������ ���Ϲ����� 
		//super�� �� �ᵵ ��. ����� �޾Ƽ� ������ü�� �޼ҵ带 �׳� ����� �� ����
		this.b= b;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}