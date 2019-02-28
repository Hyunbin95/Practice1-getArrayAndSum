package java2020;

public class OuterClass {
	class InnerClass{
		public void innerMethod() {
			System.out.println("이너 클래스의 메소드");
		}
	}
	
	//static 멤버를 가지고 있는 경우에는 static inner class로 생성해서
	//하나만 생성되도록 해주어야 합니다.
	static class StaticInnerClass{
		public static int n;
	}
	
	public void method() {
		//메소드 안에서 만들어진 내부 클래스
		//Local은 자기 영역 내에서만 사용할 수 있습니다.
		class LocalInnerClass{
			public void innerMethod() {
				System.out.println("이너 클래스의 메소드");
				
			}
		}
	}
	//LocalInnerClass c = new LocalInnerClass();
}
