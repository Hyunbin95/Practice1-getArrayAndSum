package java0218;

public class Test {

	public static void main(String[] args) {
		// 선택정렬
		// 첫번째 부터 n-1 번째 데이터까지
		// 자신의 뒤에 있는 모든 데이터와 비교해서 정렬
		int ar[] = { 30, 50, 40, 10, 20 };
		int len = ar.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				// 앞의 데이터가 클 때 뒤의 데이터와 교체
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int data : ar) {
			System.out.print(data + " ");
		}
	}
}
