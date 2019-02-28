package java0221;

public class Main1 {
	public static void main(String[] args) {
		
		//int [] br = null;
		//System.out.printf("%d\n",br.length);
		//NullPointerException - 참조형 변수에 Null이 저장되어 있는데
		//.을 이용해서 멤버를 호출할 때 발생하는 예외
		//변수에 저장된 인스턴스 참조가 있는지 확인
		
		
		int a = 10;
		System.out.println("a: " + a);
		int[] ar = { 100, 200, 300 };
		System.out.println("ar[0]: " + ar[0]);
		//System.out.println("ar[3]:" + ar[3]);
		//데이터가 3개라서 0-2번까지만 존재하는데 범위를 넘어섰습니다.
		//이런 경우가 ArrayIndexOutOfBoundsException입니다.
		//인덱스를 수정해서 해결해야 합니다.
		
		String num1 = "176";
		String num2 = "2 3";
		int n1 = Integer.parseInt(num1);
		//int n2 = Integer.parseInt(num2);
		//num2 에 저장되어있는 2 3 의 공백은 숫자로 변경되지 않는 데이터인데 숫자로 변경을 시도하였기 때문에 발생
		//이런 경우가 NumberFormatException입니다.
		
		try {
		int r = 100 / 0;
		System.out.println("r: " + r);
		}catch(Exception e) {
			System.out.printf("예외가 발생했습니다.\n");
		}
		System.out.printf("정상적으로 종료\n");
	}
}
