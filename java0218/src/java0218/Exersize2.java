package java0218;

public class Exersize2 {

	public static void main(String[] args) {
	
		int repeat = 20; // �Ƕ�̵��� ũ�⸦ �������ִ� ����.
		int number = 1; 
		for(int i=0; i<repeat; i++) {
			for(int j=0; j<repeat-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				if(number==10) { //if���� �ϳ��� ����
					number=1;
				}
				if(k==0 || k==i*2) { 	//ó���� �ڸ� ���ڷ� ����� �� �ְ� ���� if��
					System.out.print(number);
					number++;
				}else if(i==repeat-1) { //�ݺ����� ���������� ����� �� �ǹ����� ���ڷ� �����ϱ� ���� if��
					System.out.print(number);
					number++;
				}else{
					System.out.print(" "); //����
				}
				
			}
			System.out.println(); //repeat�� ��� ���ڸ�ŭ ����
		}
		
	}
}
