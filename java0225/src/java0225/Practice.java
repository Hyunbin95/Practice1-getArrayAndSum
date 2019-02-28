package java0225;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []arr = new int [5];
		int len = arr.length;
		for(int i=0; i<len; i++) {
			System.out.printf("ют╥б %d",i+1);
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int imsi : arr) {
			System.out.printf("%d\t", imsi);
		}
		
		
		
		
		
		sc.close();
		
	
	}

}
