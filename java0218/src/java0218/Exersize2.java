package java0218;

public class Exersize2 {

	public static void main(String[] args) {
	
		int repeat = 20; // 피라미드의 크기를 설정해주는 변수.
		int number = 1; 
		for(int i=0; i<repeat; i++) {
			for(int j=0; j<repeat-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				if(number==10) { //if문을 하나로 줄임
					number=1;
				}
				if(k==0 || k==i*2) { 	//처음과 뒤를 숫자로 출력할 수 있게 만든 if문
					System.out.print(number);
					number++;
				}else if(i==repeat-1) { //반복문이 마지막으로 수행될 때 맨밑줄을 숫자로 도배하기 위한 if문
					System.out.print(number);
					number++;
				}else{
					System.out.print(" "); //공백
				}
				
			}
			System.out.println(); //repeat에 담긴 숫자만큼 개행
		}
		
	}
}
