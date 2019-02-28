package java0215;

public class ArrayTest4 {

	public static void main(String[] args) {

		//int[] ar = { 10, 50, 88, 64, 87, 96, 98, 15, 54 };
		/*
		
		// 60점 이상인 데이터의 합계, 개수, 평균(소수 2자리 까지 출력)
		int sum = 0; // 합계
		int cnt = 0; // 개수
		for (int x : ar) {
			if (x >= 60) {
				sum = sum + x;
				cnt++;
			}
		}
		System.out.printf("합계 : %d \n개수 :%d\n", sum, cnt);
		if(cnt > 0){
			double avg = (double) sum / cnt;
			System.out.printf("평균:%.2f\n", avg);
			}else{
			System.out.printf("조건에 맞는 데이터가 없습니다.\n");
			}
		*/
	
		
		//배열의 최대값을 구하는방법
		/*
		int firstData=ar[0];
		for(int temp : ar) {
			if(firstData<=temp) {
				firstData=temp;
			}
		}
		System.out.println("최대값 : "+firstData);
		//배열의 최소값 구하는 방법
		for(int temp : ar) {
			if(firstData>=temp) {
				firstData=temp;
			}
		}
		System.out.println("최소값 : "+firstData);
		*/
		//2개 배열 합치기 - merge
		int [] ar1 = {40, 70, 30, 65, 93, 48, 88};
		int [] ar2 = {51, 73};
		//2개의 데이터를 저장할 배열을 생성
		int [] merge = new int [ar1.length + ar2.length];
		//첫번째 배열의 데이터 옮기기
		for(int i=0; i<ar1.length ; i=i+1) {
			merge[i] = ar1[i];
		}
		//두번째 배열의 데이터 옮기기
		for(int i=0; i<ar2.length ; i=i+1) {
			merge[ar1.length+i] = ar2[i];
		}
		//저장된지 확인하기 위한 출력
		for(int data : merge) {
			System.out.printf("%d\t", data);
		}
		
	}
}
