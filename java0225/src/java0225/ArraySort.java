package java0225;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int [] intAr = {100, 765, 76, 87, 98, 87};
		Arrays.sort(intAr);
		for(int imsi : intAr) {
			System.out.printf("%d\t",imsi);
		}
		System.out.println();
		
		String [] name = {"김송언","임영욱","김준수","정대진","정종남","이현빈","박철순","심규민"};
		Arrays.sort(name);
		for(String imsi : name) {
			System.out.printf("%s\t",imsi);
		}
		System.out.println();
		
	}
}
