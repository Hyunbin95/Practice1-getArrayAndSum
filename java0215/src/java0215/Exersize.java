package java0215;

public class Exersize {

	public static void main(String[] args) {
	//   * 
	//  ***
	// *****
	//******* �̷� ���� �����
		//char star ='*';
		//String star = "**";
		//int i = 0; 
		int repeat = 4; //�Ƕ�̵��� ���� ���� �� �� �ְ� ���� ����. 
		for(int j=0; j<repeat; j++) {
			for(int i=repeat; i>j; i--) { // �ѹ��� �����ϰ� ����� ��.
				System.out.print(" "); // 
			}
			
			for(int k=0; k<j*2+1; k++) { //k<j*2+1 1 3 5 7 9�������� ����� ������� 
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