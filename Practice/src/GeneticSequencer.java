
public class GeneticSequencer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ϳ��� ���Ͽ��� �κ� ������ ã�Ƴ��� ���� ���⼭�� �м��̶�� �մϴ�.
		String str = "AOPSOAOAJSHDKSAOAOAAJSKS";
		String msg = "AOA";
		int size = str.length();
		for(int i=0; i<size-2; i++) {
			//str�� ù���� ��������
			char start = str.charAt(i);
			//str�� ù���ڿ� msg�� ù���ڰ� �����ϴٸ�
			if(start == msg.charAt(0)) {
				boolean flag = false;
				//str�� ���� ���ڿ� msg�� ���� ���ڸ� ��
				for(int j=1; j<3; j++) {
					//���� �ٸ� ���ڰ� �ִٸ� flag �� true�� �˴ϴ�.
					if(str.charAt(i+j) != msg.charAt(j)) {
						flag = true;
						break;
					}
				}
				//��� ���ڰ� ���� ���
				if(flag == false) {
					System.out.printf("������ ������ ��ġ : %d\n",i);
					//���� ������ �������� �ѱ�� ���ؼ�
					i = i+2;
					
				}
			}
		}

	}

}
