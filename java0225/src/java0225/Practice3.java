package java0225;

public class Practice3 {

	public static void main(String[] args) {
		
		for(int wan=2; wan<=1000; wan++) {
			int compare=1;
			for(int cnt=2; cnt<wan; cnt++) {
				if(wan%cnt==0) { // 약수를 compare 에 더하기
					compare += cnt;
				}
			}
			if(wan==compare) { //비교대상이 약수를 다 더한 값과 같으면 완전수 일때 출력
				System.out.printf("%d\t", wan);
			}
		}

	}

}
