package java0225;

public class String1 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		int length = str.length(); //.을 찍으면 다른 메모리공간을 찾아가기 때문에 반복문에 넣지 않았다. 동선낭비 x
		for (int i =0 ;i<length;i++) { 
			char ch = str.charAt(i);
		System.out.print(ch);
		}
		
		System.out.println();
		
		String upper ="";
		for(int i=0; i<length; i++) {
			char ch = str.charAt(i);
			if('a'<=ch && ch<='z') {
				char t = (char)(ch-32);
				upper = upper+t;
			}
			else {
				upper = upper+ch;
			}
		}
		System.out.printf("%s\n",upper);
		String down = "";
		for(int i=0;i<length; i++) {
			char ch = str.charAt(i);
			if('A'<=ch && ch<='Z') {
				char t = (char)(ch+32);
				down = down+t;
			}else
				down = down+ch;
		}
		System.out.printf("%s\n",down);
		System.out.printf("%c", 57);
	}
}
