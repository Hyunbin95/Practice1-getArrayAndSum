package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//SampleThread Ŭ������ �ν��Ͻ� ����
		//SampleThread st1 = new SampleThread();
		//SampleThread st2 = new SampleThread();
		
		//�Ϲ� �޼ҵ� ȣ��
		//st1.run();
		//st2.run();
		
		//������ ����
		//st1.start();
		//st2.start();
		/*
		//������ Ŭ�����κ��� ��ӹ޴� �ν��Ͻ� ����
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//anoymous class �̿�
		//�޸𸮸� ������ �� ������ ���� ���� �ν��Ͻ� ������ ����
		Thread th2 = new Thread() {
			
			@Override
			public void run() {
				try {
					for(int i=0; i<20; i++) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass �̿�\n");
					}
				}
				catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
			};
		th2.start();
		
		//Runnable �������̽��� �̿��� ������ ���� �� ����
		Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i=0; i<20; i++) {
						Thread.sleep(500);
						System.out.printf("Runnable �������̽� �̿�\n");
					}
				}
				catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
				
			}
		};
		Thread th4 = new Thread(th3);
		th4.start();
		*/
		
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<10; i++) {
						Thread.sleep(1000);
						System.out.println("���� ������");
					}
				}catch(InterruptedException e) {
					//���ܰ� �߻����� �� �����带 ������ �� �ֵ��� return�� �ۼ�
					return;
				}
			}
		};
		//���� ������� ���� - �ٸ� �����尡 ���� ���� �ƴϸ� �ڵ� ����
		//start ȣ���ϱ� ���� ����
		//�¶��ΰ��ӿ��� ������ ���۵ ���� ���
		backgroundThread.setPriority(Thread.MAX_PRIORITY);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<5; i++) {
						Thread.sleep(1000);
						System.out.printf("���׶��� ������\n");
						if(i==1) {
							//backgroundThread�� InterruptedException�� ������ 
							//�߻���Ű�� ����
							backgroundThread.interrupt();
						}
					}
				}catch(Exception e) {}
			}
			
		};
		//���󽺷��尡 �ƴϱ� ������ ������ ���� ��Ű�� �ʴ� �̻�
		//5�� ���� �۾��� ����
		//�켱 ���� ����
		foregroundThread.setPriority(Thread.MIN_PRIORITY);
		foregroundThread.start();
		
		
	}

}