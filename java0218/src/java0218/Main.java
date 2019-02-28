package java0218;

public class Main {

	public static void main(String[] args) {
		/*
		 * // Sample 클래스의 인스턴스 만들기 Sample obj = new Sample(); //obj를 출력 = 클래스 이름과 해시코드가
		 * 출력됩니다. System.out.println(obj);
		 * 
		 * //static이 붙지 않은 변수는 인스턴스 별로 별도로 같습니다. obj.name = "아이린"; //static 변수는 하나만 만들어서
		 * 공유합니다. obj.schoolName = "SM";
		 * 
		 * //Sample 클래스의 인스턴스 만들기 Sample ins = new Sample(); ins.name = "수지";
		 * ins.schoolName = "JYP";
		 * 
		 * System.out.println(obj.name); System.out.println(ins.name);
		 * 
		 * System.out.println(obj.schoolName); System.out.println(ins.schoolName);
		 * System.out.println(Sample.schoolName);
		 * 
		 * //final이 붙으면 수정을 할 수 없습니다. //final이 붙은 변수의 이름은 전부 대문자로 해서 구분합니다. final int
		 * TEN = 10; //TEN = 20; System.out.println(TEN);
		 */
		// MethodClass 의 Instance 생성
		MethodClass mc = new MethodClass();
		// 메소드 호출
		mc.disp();
		System.out.println("======================");
		mc.disp();
		// 매개변수가 있는 메소드를 호출할 때는 매개변수를 대입해서 호출해야 합니다.
		System.out.println("======================");
		mc.argDisp(3);
		System.out.println("======================");
		mc.argDisp("Hello resister", 5);
		// 매개변수가 ...으로 되어 있으면 매개변수 개수에 상관없이 대입가능
		mc.varargsSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int a = 10;
		int[] ar = { 100, 200, 300 };
		// value 타입을 전달하므로 a의 값은 변경되지 않습니다.
		mc.inc(a);
		// reference 타입을 전달하므로 ar의 데이터가 변경되었을 수 있습니다.
		mc.inc(ar);
		System.out.println(a);
		System.out.println(ar[0]);

	}

}