
package java0219;

public class Main {

	public static void main(String[] args) {
		/*
		 * //MethodClass�� Instance ���� MethodClass instance = new MethodClass();
		 * MethodClass2 it = new MethodClass2(); //return �� ���� �޼ҵ� ȣ�� - ���⼭ �帧 �ߴ�
		 * instance.addNoReturn(100, 200); //�޼ҵ� �ȿ��� �޼ҵ带 ȣ���ϱ� - ���������� ���� �ʴ� ���� �����ϴ�.
		 * System.out.println(instance.addReturn(instance.addReturn(100,200),300));
		 * 
		 * //���� ������ ������ ���� recursion�� �� ������ ������ //���� ������ �����ϴ� ��� �޸𸮰� ���������ų� ����ӵ���
		 * �������ϴ�. System.out.println(instance.sumNoRecursion(10));
		 * System.out.println(instance.sumRecursion(10));
		 * 
		 * System.out.println(instance.fibonacci(15));
		 * 
		 * //static �޼ҵ带 ȣ���� ���� Ŭ���� �̸����� ȣ�� MethodClass2.staticMethod(); it.thisTest();
		 * 
		 * double r = 10*Math.random(); System.out.println((int)r);
		 * 
		 * java.util.Random random = new java.util.Random(); int r2 = random.nextInt();
		 * System.out.println(r2);
		 */

		// �ν��Ͻ� ����
		// �տ� ����� �̸��� Ŭ�����̸��̰� �ڿ� ������̸��� ������ �̸�
		/*
		ConstructorClass obj = new ConstructorClass();
		obj.setNum(1);
		obj.setName("������");
		System.out.println("obj1�� num: " + obj.getNum());

		ConstructorClass obj2 = new ConstructorClass();
		obj2.setNum(2);
		obj2.setName("����");
		System.out.println(obj.getName() + " " + obj2.getName());

		ConstructorClass obj3 = new ConstructorClass(3, "95��� ������");
		System.out.println(obj3.getNum() + " " + obj3.getName());
		*/
		/*
		Based b = new Based();
		//���� Ŭ���������� ���� Ŭ������ ����� ���� �����޽��ϴ�.
		Drived d = new Drived();
		d.superMethod();
		d.commonMethod();
		d.subMethod();
		 */
		Based b = new Based();
		//���� Ŭ���� Ÿ������ ������� ������ ������ ���� Ŭ���� Ÿ���� �ν��Ͻ��� ������ �� �ֽ��ϴ�.
		Based x = new Drived();
		
		
		//���� Ŭ���� Ÿ������ ������� ������ ������ ���� Ŭ���� Ÿ����
		//�ν��Ͻ� ������ ������ ���� �����ϴ�.
		//�� ���� ���� �� ��ȯ�� �ؼ� �����ؾ� �մϴ�.
		
		//������ �ƴ����� �����ϸ� ���ܰ� �߻�
		//������ �ڷ����� Based �̱� �����Դϴ�.
		//Drived d = (Drived)new Based();
		
		//�ν��Ͻ��� ������ �� ���� Ŭ���� Ÿ������ ���� ����
		//������ �ڷ������� �� ��ȯ�ص� ������ �߻����� �ʽ��ϴ�.
		Drived d = (Drived)x;
	}
}
