package java0226;

//���̵�, ��й�ȣ, �̸�, ����,��ȣ �� ���� �����ϴ� Ŭ����
public class VO implements Comparable{
	
	private String id;
	private String pw;
	private String name;
	private int age;
	private int num;

	//������
	public VO() {
		super();
	}
	//�Ű������� �ִ� ������
	public VO(String id, String pw, String name, int age, int num) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	//������ �޼ҵ�
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	//������� ���� �޼ҵ�: ����� ���� Ȯ���ϱ� ���� �޼ҵ�
	//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� ȣ��Ǵ� �޼ҵ�
	
	@Override
	public String toString() {
		return "VO [id=" + id + ", pw=" + pw + ", name=" + name +
				", age=" + age + ", num=" + num + "]";
	}
	
	//ũ�� �񱳸� ���� �޼ҵ�
	//������ �����Ͱ� �� ũ�� ����� ����
	//2���� �����Ͱ� �����ϸ� 0 
	//������ �����Ͱ� ������ ������ ����
	//�������� ���� - ���������� �ϰ��� �ϸ� ��ȣ�� �ݴ�� ����
	@Override
	public int compareTo(Object o) {
		//Object Ÿ���� �����͸� ����� ���� ������ �ڷ������� ����ȯ�ؼ� ���
		//����� Ŭ������ VO �̹Ƿ� VO Ÿ������ �� ��ȯ
		//���� �����ʹ� �E���� �̿��ϸ� �˴ϴ�.
		//���ڿ��� ������ �� ���� ���ڿ� ũ�� ���ϴ� �޼ҵ� ���
		//java������ compareTo
		
		VO other = (VO)o;
		return this.name.compareTo(other.name);
		
	}
}