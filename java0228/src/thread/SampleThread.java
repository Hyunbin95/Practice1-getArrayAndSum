package thread;

public class SampleThread extends Thread {
	//������� ������ �޼ҵ�
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
