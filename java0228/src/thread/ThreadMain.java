package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//SampleThread 클래스의 인스턴스 생성
		//SampleThread st1 = new SampleThread();
		//SampleThread st2 = new SampleThread();
		
		//일반 메소드 호출
		//st1.run();
		//st2.run();
		
		//스레드 시작
		//st1.start();
		//st2.start();
		/*
		//스레드 클래스로부터 상속받는 인스턴스 생성
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//anoymous class 이용
		//메모리를 절약할 수 있지만 여러 개의 인스턴스 생성을 못함
		Thread th2 = new Thread() {
			
			@Override
			public void run() {
				try {
					for(int i=0; i<20; i++) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass 이용\n");
					}
				}
				catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
			};
		th2.start();
		
		//Runnable 인터페이스를 이용한 스레드 생성 및 시작
		Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i=0; i<20; i++) {
						Thread.sleep(500);
						System.out.printf("Runnable 인터페이스 이용\n");
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
						System.out.println("데몬 스레드");
					}
				}catch(InterruptedException e) {
					//예외가 발생했을 때 스레드를 종료할 수 있도록 return을 작성
					return;
				}
			}
		};
		//데몬 스레드로 생성 - 다른 스레드가 동작 중이 아니면 자동 중지
		//start 호출하기 전에 설정
		//온라인게임에서 데이터 전송등에 많이 사용
		backgroundThread.setPriority(Thread.MAX_PRIORITY);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<5; i++) {
						Thread.sleep(1000);
						System.out.printf("포그라운드 스레드\n");
						if(i==1) {
							//backgroundThread에 InterruptedException을 강제로 
							//발생시키는 구문
							backgroundThread.interrupt();
						}
					}
				}catch(Exception e) {}
			}
			
		};
		//데몬스레드가 아니기 때문에 강제로 중지 시키지 않는 이상
		//5초 동안 작업을 수행
		//우선 순위 변경
		foregroundThread.setPriority(Thread.MIN_PRIORITY);
		foregroundThread.start();
		
		
	}

}