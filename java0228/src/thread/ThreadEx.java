package thread;

//Thread Ŭ�����κ��� ��ӹ޴� Ŭ����
public class ThreadEx extends Thread {

	//�������̵� �� �޼ҵ����� Ȯ�����ִ� ������̼�
	//�� ������ �����̸� �������̵� �� �޼ҵ尡 �ƴմϴ�.
	@Override
	public void run() {
		try {
			//���� �߻� ���ɼ��� �ִ� �ڵ�
			for(int i=1; i<6; i++) {
				Thread.sleep(1000);
				System.out.printf("Tread Create Execute\n");
			}
		}catch (Exception e) {
			//���ܰ� �߻����� �� ������ ����
			//���� ���� ���
			System.out.printf("���� ����:%s\n", e.getMessage());
			
		}finally {
			//���� �߻����ο� ������� ������ ����
		}
	}
}
