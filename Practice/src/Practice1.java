
public class Practice1 {

	public static void main(String[] args) {
		// ���� �迭�� �����հ� ���� ���� ����Ͻÿ�
		// int [][]ar={{10,20,30},{40,50,60},{70,80,90}}
		int[][] ar = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int row = 0; // ���� �����ϱ� ���� ���� ����
		int col = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				row += ar[i][j];
				col += ar[j][i];
			}
			System.out.println("���� �հ� : " + row +"\n���� �հ� : " + col);
		}
	}
}
