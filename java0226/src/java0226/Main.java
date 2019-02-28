package java0226;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int [] ar = {20,30,50,10,40,70,60};
		//10이 몇번째 있는지 검색
		//정렬되어 있지 않아서 이분검색을 제대로 수행할 수 없습니다.
		int pos = Arrays.binarySearch(ar, 20);
		System.out.println("20이 있는 위치 : " + pos);
		Arrays.sort(ar);
		//데이터 정렬 {10,20,30,40,50,60,70}
		System.out.println();
		//정렬이 되어 이분검색의 결과가 제대로 나옵니다.
		pos = Arrays.binarySearch(ar, 20);
		System.out.printf("20이 있는 위치 : %d ",pos);
	}

}
