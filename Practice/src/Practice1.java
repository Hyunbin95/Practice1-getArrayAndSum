
public class Practice1 {

	public static void main(String[] args) {
		// 다음 배열의 가로합과 세로 합을 출력하시오
		// int [][]ar={{10,20,30},{40,50,60},{70,80,90}}
		int[][] ar = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int row = 0; // 합을 저장하기 위한 변수 생성
		int col = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				row += ar[i][j];
				col += ar[j][i];
			}
			System.out.println("가로 합계 : " + row +"\n세로 합계 : " + col);
		}
	}
}
