package java2020;

public class OuterClass {
	class InnerClass{
		public void innerMethod() {
			System.out.println("�̳� Ŭ������ �޼ҵ�");
		}
	}
	
	//static ����� ������ �ִ� ��쿡�� static inner class�� �����ؼ�
	//�ϳ��� �����ǵ��� ���־�� �մϴ�.
	static class StaticInnerClass{
		public static int n;
	}
	
	public void method() {
		//�޼ҵ� �ȿ��� ������� ���� Ŭ����
		//Local�� �ڱ� ���� �������� ����� �� �ֽ��ϴ�.
		class LocalInnerClass{
			public void innerMethod() {
				System.out.println("�̳� Ŭ������ �޼ҵ�");
				
			}
		}
	}
	//LocalInnerClass c = new LocalInnerClass();
}
