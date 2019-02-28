package java0215;

public class Exersize {

	public static void main(String[] args) {
	//   * 
	//  ***
	// *****
	//******* 이런 문양 만들기
		//char star ='*';
		//String star = "**";
		//int i = 0; 
		int repeat = 4; //피라미드의 층을 조절 할 수 있게 만든 변수. 
		for(int j=0; j<repeat; j++) {
			for(int i=repeat; i>j; i--) { // 한번씩 감소하게 만드는 식.
				System.out.print(" "); // 
			}
			
			for(int k=0; k<j*2+1; k++) { //k<j*2+1 1 3 5 7 9형식으로 출력을 만들어줌 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		for(int i=0; i<repeat; i++) {
			for(int j=repeat; j>i; j--) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int k=0; k<i; k++) {
				System.out.print("**");
			}
			System.out.println();
		}
		
	}
}