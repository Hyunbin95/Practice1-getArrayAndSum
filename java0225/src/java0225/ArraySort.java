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
		
		String [] name = {"��۾�","�ӿ���","���ؼ�","������","������","������","��ö��","�ɱԹ�"};
		Arrays.sort(name);
		for(String imsi : name) {
			System.out.printf("%s\t",imsi);
		}
		System.out.println();
		
	}
}
