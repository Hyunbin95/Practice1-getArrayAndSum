package java0225;

public class Practice3 {

	public static void main(String[] args) {
		
		for(int wan=2; wan<=1000; wan++) {
			int compare=1;
			for(int cnt=2; cnt<wan; cnt++) {
				if(wan%cnt==0) { // ����� compare �� ���ϱ�
					compare += cnt;
				}
			}
			if(wan==compare) { //�񱳴���� ����� �� ���� ���� ������ ������ �϶� ���
				System.out.printf("%d\t", wan);
			}
		}

	}

}
