package java0218;

public class Exersize4 {
	
	public void exer(int n) {
		
	int a = 1;
	//int b = 15;
	for (int i = 0; i < n; i++) {
		if (a == 10) {
			a = 1;
		}
		for (int j = 0; j < n - i; j++) {
			System.out.print(" ");
		}
		System.out.print(a);
		a++;
		if (i == 0) {
			System.out.println();
			continue;
		}
		for (int k = 2; k < i * 2 + 1; k++) {// 조건식과 판별식이 1,3,5,7순으로 가야 되는데 1이생략되어 3,5,7 순으로 가게되어 모양이 이상해짐
			if (a == 10) {
				a = 1;
			}
			if (i == n - 1) {
				System.out.print(a); // a가 10을 넘어가게되면 두자리 수 를 차지하기 때문에 피라미드 모양의 균형이 깨지게 됨.
				a++;
				continue;
			}
			System.out.print(" ");
		}
		System.out.println(a);
		a++;
	}
	}
}
