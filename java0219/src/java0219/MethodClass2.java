package java0219;

public class MethodClass2 {

	//static �޼ҵ� - Ŭ���� �̸����� ȣ���� �� �ִ� �޼ҵ�
	//�ν��Ͻ� ������ ����� �� �����ϴ�.
	//this�� ���� �����Դϴ�.
	private int age=25;
	private boolean gender;
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void staticMethod() {
		//�ν��Ͻ� ������ ȣ���ϸ� ����
		//age = 10;
		System.out.printf("static method\n");
	}
	//���� �տ� this�� ������ �޼ҵ� �ܺο������� ã�� this�� ������
	//�޼ҵ� �ȿ������� ã���ϴ�.
	public void thisTest() {
		int age = 23;
		System.out.println(age);
		System.out.println(this.age);
	}
}
