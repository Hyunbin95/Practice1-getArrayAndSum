package objecttest;

//���� ���� �����͸� �ϳ��� ��� �����ϱ� ���� Ŭ����
public class Data {
	
	private int num; //�۹�ȣ
	private String title; // ������
	private String content; // �۳���
	
	//������ �޼ҵ�
	public Data() {
		super();
	}

	public Data(int num, String title, String content) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
	}

	//������ �޼ҵ�
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//�ν��Ͻ� ������ ������ �����ִ� �޼ҵ� - equals
	public boolean equals(Data other) {
		//num�� ������ ���� ������ ����
		return this.num == other.num;
	}
	
	//�ν��Ͻ��� �������ִ� �޼ҵ� - clone
	public Data clone() {
		Data other = new Data();
		//other.setNum(this.num);
		//�̷������� �ᵵ�ȴ�.
		other.num = this.num;
		other.title = this.title;
		other.content = this.content;
		return other;
	}

	@Override
	public String toString() {
		return "Data [num=" + num + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
