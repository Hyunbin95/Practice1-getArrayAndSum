import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		// �޴�(����)�� �Է¹ޱ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴� �Է�");
		final String VETNAM = "��Ʈ��";
		final String CHINA = "�߱�";
		final String JAPAN = "�Ϻ�";
		final String KOREA = "�ѱ�";
		
		String menu = sc.nextLine();
		
		switch(menu) {
		case VETNAM:
			System.out.println("�ұ���");
			break;
		case CHINA:
			System.out.println("��ٷο�");
			break;
		case JAPAN :
			System.out.println("���θ�");
			break;
		case KOREA :
			System.out.println("��ġ������");
			break;
		default:
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
		}		
		sc.close();
		
	}
}