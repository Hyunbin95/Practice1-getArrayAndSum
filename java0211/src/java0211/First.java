package java0211;

//Ŭ���� ����
public class First {
	//���� �޼ҵ� ����
	public static void main(String[] args) {
		//�ֿܼ� ����ϰ� �� ������ �ϴ� �޼ҵ带 ȣ��
		String b = "������";
		
		new Second();
		Second.selfIntro(b);
		Second.age(25);
		System.out.println(args);
	}

}
