package java0218;

public class Main {

	public static void main(String[] args) {
		/*
		 * // Sample Ŭ������ �ν��Ͻ� ����� Sample obj = new Sample(); //obj�� ��� = Ŭ���� �̸��� �ؽ��ڵ尡
		 * ��µ˴ϴ�. System.out.println(obj);
		 * 
		 * //static�� ���� ���� ������ �ν��Ͻ� ���� ������ �����ϴ�. obj.name = "���̸�"; //static ������ �ϳ��� ����
		 * �����մϴ�. obj.schoolName = "SM";
		 * 
		 * //Sample Ŭ������ �ν��Ͻ� ����� Sample ins = new Sample(); ins.name = "����";
		 * ins.schoolName = "JYP";
		 * 
		 * System.out.println(obj.name); System.out.println(ins.name);
		 * 
		 * System.out.println(obj.schoolName); System.out.println(ins.schoolName);
		 * System.out.println(Sample.schoolName);
		 * 
		 * //final�� ������ ������ �� �� �����ϴ�. //final�� ���� ������ �̸��� ���� �빮�ڷ� �ؼ� �����մϴ�. final int
		 * TEN = 10; //TEN = 20; System.out.println(TEN);
		 */
		// MethodClass �� Instance ����
		MethodClass mc = new MethodClass();
		// �޼ҵ� ȣ��
		mc.disp();
		System.out.println("======================");
		mc.disp();
		// �Ű������� �ִ� �޼ҵ带 ȣ���� ���� �Ű������� �����ؼ� ȣ���ؾ� �մϴ�.
		System.out.println("======================");
		mc.argDisp(3);
		System.out.println("======================");
		mc.argDisp("Hello resister", 5);
		// �Ű������� ...���� �Ǿ� ������ �Ű����� ������ ������� ���԰���
		mc.varargsSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int a = 10;
		int[] ar = { 100, 200, 300 };
		// value Ÿ���� �����ϹǷ� a�� ���� ������� �ʽ��ϴ�.
		mc.inc(a);
		// reference Ÿ���� �����ϹǷ� ar�� �����Ͱ� ����Ǿ��� �� �ֽ��ϴ�.
		mc.inc(ar);
		System.out.println(a);
		System.out.println(ar[0]);

	}

}