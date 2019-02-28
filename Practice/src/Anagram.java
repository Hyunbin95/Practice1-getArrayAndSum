
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String anagram = new String("EROS");
		
		int len = anagram.length();
		char[] str = new char[len+1];
		int k=0;
		while(k<6) {
			for(int i=0; i<len; i++) {
				str[i]= anagram.charAt(i);
				if(i==len-1) {
					str[4]=str[0];
				}
			}
			for(int j=0 ;j<len; j++) {
				System.out.printf("%c",str[j]);
			}
			k++;
		}
	}

}
