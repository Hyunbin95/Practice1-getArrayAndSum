
public class GeneticSequencer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//하나의 패턴에서 부분 패턴을 찾아내는 것을 염기서열 분석이라고 합니다.
		String str = "AOPSOAOAJSHDKSAOAOAAJSKS";
		String msg = "AOA";
		int size = str.length();
		for(int i=0; i<size-2; i++) {
			//str의 첫글자 가져오기
			char start = str.charAt(i);
			//str의 첫글자와 msg의 첫글자가 동일하다면
			if(start == msg.charAt(0)) {
				boolean flag = false;
				//str의 다음 글자와 msg의 다음 글자를 비교
				for(int j=1; j<3; j++) {
					//서로 다른 글자가 있다면 flag 는 true가 됩니다.
					if(str.charAt(i+j) != msg.charAt(j)) {
						flag = true;
						break;
					}
				}
				//모든 글자가 같은 경우
				if(flag == false) {
					System.out.printf("동일한 패턴의 위치 : %d\n",i);
					//현재 패턴을 다음으로 넘기기 위해서
					i = i+2;
					
				}
			}
		}

	}

}
