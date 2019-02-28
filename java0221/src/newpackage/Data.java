package newpackage;

//번호와 이름을 저장하는 클래스
public class Data {
	
	//변수는 private으로
	private int ph;
	private String name;
	
	//매개변수가 없는 생성자 - Default Constructor
	public Data() {
		super();
	}
	//매개변수가 2개 있는 생성자
	public Data(int ph, String name) {
		super();
		this.ph = ph;
		this.name = name;
	}

	//변수에 접근할 수 있는 메소드 - 접근자 메소드
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
	
	
	
	//내용을 비교하는 equals 메소드
	public boolean equlas(Data other) {
		return this.ph == other.ph; 
	}
	public boolean equl(Data other) {
		return this.ph == other.ph && this.name == other.name;
	}
	
	
	
	//자기 자신과 동일한 내용을 가진 데이터를 복제해주는 clone 메소드
	public Data clone() {
		Data other = new Data();
		other.setPh(this.ph);
		other.setName(this.name);
		//만들어진 인스턴스를 리턴
		return other;
	}
	
	
}