package objecttest;

//여러 개의 데이터를 하나로 묶어서 저장하기 위한 클래스
public class Data {
	
	private int num; //글번호
	private String title; // 글제목
	private String content; // 글내용
	
	//생성자 메소드
	public Data() {
		super();
	}

	public Data(int num, String title, String content) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
	}

	//접근자 메소드
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

	//인스턴스 사이의 내용을 비교해주는 메소드 - equals
	public boolean equals(Data other) {
		//num이 같으면 같은 것으로 간주
		return this.num == other.num;
	}
	
	//인스턴스를 복제해주는 메소드 - clone
	public Data clone() {
		Data other = new Data();
		//other.setNum(this.num);
		//이런식으로 써도된다.
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
