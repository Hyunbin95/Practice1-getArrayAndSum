package java0227;

public class Information {

	private int num;
	private String name;
	private String mobile;
	
	public Information() {
		super();
	}


	public Information(int num, String name, String mobile) {
		super();
		this.num = num;
		this.name = name;
		this.mobile = mobile;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setPh(String mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Information [num=" + num + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
