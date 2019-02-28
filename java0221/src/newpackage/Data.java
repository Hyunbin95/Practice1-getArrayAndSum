package newpackage;

//��ȣ�� �̸��� �����ϴ� Ŭ����
public class Data {
	
	//������ private����
	private int ph;
	private String name;
	
	//�Ű������� ���� ������ - Default Constructor
	public Data() {
		super();
	}
	//�Ű������� 2�� �ִ� ������
	public Data(int ph, String name) {
		super();
		this.ph = ph;
		this.name = name;
	}

	//������ ������ �� �ִ� �޼ҵ� - ������ �޼ҵ�
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//������ ���ϴ� equals �޼ҵ�
	public boolean equlas(Data other) {
		return this.ph == other.ph; 
	}
	public boolean equl(Data other) {
		return this.ph == other.ph && this.name == other.name;
	}
	
	
	
	//�ڱ� �ڽŰ� ������ ������ ���� �����͸� �������ִ� clone �޼ҵ�
	public Data clone() {
		Data other = new Data();
		other.setPh(this.ph);
		other.setName(this.name);
		//������� �ν��Ͻ��� ����
		return other;
	}
	
	
}