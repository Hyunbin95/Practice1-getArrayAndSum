import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []lotto = new int[6]; //로또 번호를 저장할 6개의 인자를 저장하는 배열 생성
		int num=0;// 배열의 인덱스 
		while(num<6) {
			int flag = 0; //중복을 판별할 변수
			System.out.printf("로또 번호를 입력하시오 %d : ",num+1 );
			lotto[num]=sc.nextInt();
			
			for(int i=0;i<num;i++) { 
				if(lotto[i]==lotto[num]) { // 중복 검사 
					System.out.println("중복된 숫자는 입력할 수 없습니다.");
					flag = 1; //중복이 되면 flag의 변화가 일어남
					break;
				}
			}
			if(lotto[num]<1 || 45<lotto[num]) { // 올바른 숫자를 입력했는지 판별하는 조건문
				System.out.println("1~45 사이의 숫자만 입력하시오.");
				continue; // 올바른 숫자를 입력하지 않았을 때 재 입력을 요구할 continue
			}
			if(flag ==1) {
				continue; //flag의 변화가 일어나면 중복이 일어난 것 이므로 재입력 요구
			}
			num++; // num++ 가 왔다는 건 올바른 입력을 했으므로 다음 입력을 위해 num++;
		}
		Arrays.sort(lotto);
		System.out.printf("로또번호 : ");
		for(int imsi : lotto) {
			System.out.printf("%d\t",imsi);
		}
		sc.close();
	}

}
