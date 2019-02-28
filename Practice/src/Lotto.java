import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []lotto = new int[6]; //�ζ� ��ȣ�� ������ 6���� ���ڸ� �����ϴ� �迭 ����
		int num=0;// �迭�� �ε��� 
		while(num<6) {
			int flag = 0; //�ߺ��� �Ǻ��� ����
			System.out.printf("�ζ� ��ȣ�� �Է��Ͻÿ� %d : ",num+1 );
			lotto[num]=sc.nextInt();
			
			for(int i=0;i<num;i++) { 
				if(lotto[i]==lotto[num]) { // �ߺ� �˻� 
					System.out.println("�ߺ��� ���ڴ� �Է��� �� �����ϴ�.");
					flag = 1; //�ߺ��� �Ǹ� flag�� ��ȭ�� �Ͼ
					break;
				}
			}
			if(lotto[num]<1 || 45<lotto[num]) { // �ùٸ� ���ڸ� �Է��ߴ��� �Ǻ��ϴ� ���ǹ�
				System.out.println("1~45 ������ ���ڸ� �Է��Ͻÿ�.");
				continue; // �ùٸ� ���ڸ� �Է����� �ʾ��� �� �� �Է��� �䱸�� continue
			}
			if(flag ==1) {
				continue; //flag�� ��ȭ�� �Ͼ�� �ߺ��� �Ͼ �� �̹Ƿ� ���Է� �䱸
			}
			num++; // num++ �� �Դٴ� �� �ùٸ� �Է��� �����Ƿ� ���� �Է��� ���� num++;
		}
		Arrays.sort(lotto);
		System.out.printf("�ζǹ�ȣ : ");
		for(int imsi : lotto) {
			System.out.printf("%d\t",imsi);
		}
		sc.close();
	}

}
