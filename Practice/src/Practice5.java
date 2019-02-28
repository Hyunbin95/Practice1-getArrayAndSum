
public class Practice5 {

	public static void main(String[] args) {
		
			String str = new String("AOPSOAOAJSHDKSAOAOAAJSKSAOABAOA");
			int length = str.length();

			for(int i=0; i<length-2; i++) {
				if(str.charAt(i)=='A' && str.charAt(i+1)=='O' && str.charAt(i+2) =='A'){
						System.out.printf("%d ",i);
						i=i+2;
					}
				//	System.out.printf("%d ",i);
				}
					
			
			
	}
}
