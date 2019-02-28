package annoymous;

//Korea 클래스를 상속받은 Asia 클래스
public class Asia extends Korea implements Vietnam {

	//상위 클래스의 메소드를 재정의(Override)
	@Override
	public void amugena() {
		System.out.println("아무거나 먹겠습니다.");
		}

	@Override
	public void method() {
		System.out.println("베트남 쌀국수 드셔보셨어요?");
		
	}
	}
