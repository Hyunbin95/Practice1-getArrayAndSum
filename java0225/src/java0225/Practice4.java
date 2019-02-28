package java0225;

public class Practice4 {

	public static void main(String[] args) {
		String str = new String("AOPSOAOAJSHDKSAOAOAAJSKSAOAAOA");
		int length = str.length();

		for(int i=0; i<length; i++) {
			if(str.charAt(i)=='A' && str.charAt(i+1)=='O' && str.charAt(i+2) =='A') {
				System.out.printf("%d ",i);
				i+=2;
				https://github.com/Hyunbin95/Practice1-getArrayAndSum.git
			}
				
			}
		System.out.println();
		

	}

}
