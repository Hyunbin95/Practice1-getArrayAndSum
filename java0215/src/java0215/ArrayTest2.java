package java0215;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열을 생성하고 나중에 데이터를 대입

		// 배열의 데이터를 직접 입력받아보기
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 아이돌 그룹 수를 입력하세요");
		int x = sc.nextInt();

		String[] girlGroup = new String[x];
		int max = girlGroup.length;
		sc.nextLine();// 문자열을 입력할때는 앞에 sc.next데이터 형식() 라인을 입력해주어야 한다.
		for (int i = 0; i < max; i++) {
			System.out.println("입력>" + (i + 1));
			girlGroup[i] = sc.nextLine();
		}
		/*
		 * girlGroup[0] = "소녀시대"; girlGroup[1] = "레드벨벳"; girlGroup[2] = "트와이스";
		 * girlGroup[3] = "AOA"; girlGroup[4] = "블랙핑크";
		 */
		/*
		 * 배열의 요소 출력 System.out.printf("%s\n", girlGroup[0]); System.out.printf("%s\n",
		 * girlGroup[1]); System.out.printf("%s\n", girlGroup[2]);
		 * System.out.printf("%s\n", girlGroup[3]); System.out.printf("%s\n",
		 * girlGroup[4]);
		 * 
		 * //동일한 문장이나 일정한 패턴을 갖는 문장을 반복문을 이용해서 작성하면 //코드의 라인 수도 줄고 하나의 문장으로 처리할 수 있기 때문에
		 * 유지보수에 유리 //배열의 데이터 개수를 상수로 설정하면 배열의 데이터 개수가 변경될 때 같이 수정해야 합니다.
		 */
		/*
		 * int i=0; while(i<5) { System.out.printf("%s\n", girlGroup[i]); i=i+1; }
		 */
		// 배열의 데이터 개수를 상수로 직접 설정하지 않고 .length를 이용
		// 반복문 안에서 동일한 데이터를 접근하는 경우에
		// 이 데이터가 head에 생성된 데이터라면 가까운 곳으로 옮겨놓고 사용하는 것이 좋습니다.
		/*
		 * int i=0; while(i<max) { System.out.printf("%s\n", girlGroup[i]); i=i+1; }
		 */
		/*
		 * int i=0; int size = girlGroup.length; while(i<max) {
		 * System.out.printf("%s\n", girlGroup[i]); i=i+1;
		 */

		// 빠른 열거를 이용한 배열의 데이터 출력
		for (String temp : girlGroup) {
			System.out.println(temp);
		}
		sc.close();
	}
}
