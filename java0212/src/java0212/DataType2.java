package java0212;

public class DataType2 {
static int age;
static double height;
static String gender;
	DataType2(int age, double height, String gender){
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	public static void age() {
		System.out.println("나이 : " + age);
	}
	public static void height() {
		System.out.println("신장 : " + height);
	}
	public static void gender() {
		System.out.println("성별 : " + gender);
	}
	
}
