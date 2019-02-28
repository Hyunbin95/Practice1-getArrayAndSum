import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		// 메뉴(정수)를 입력받기 위한 구문
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 입력");
		final String VETNAM = "베트남";
		final String CHINA = "중국";
		final String JAPAN = "일본";
		final String KOREA = "한국";
		
		String menu = sc.nextLine();
		
		switch(menu) {
		case VETNAM:
			System.out.println("쌀국수");
			break;
		case CHINA:
			System.out.println("꿔바로우");
			break;
		case JAPAN :
			System.out.println("돈부리");
			break;
		case KOREA :
			System.out.println("김치볶음밥");
			break;
		default:
			System.out.println("올바른 입력이 아닙니다.");
		}		
		sc.close();
		
	}
}