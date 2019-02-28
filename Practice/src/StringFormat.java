
public class StringFormat {

	public static void main(String[] args) {
		//String.format 메소드는 System.out.printf 와 동일한 방법으로 사용
		//출력하지 않고 문자열로 리턴한다는 점이 다릅니다.
		int x = 100;
		int y = 200;
		String msg = String.format("x:%d y:%d\n", x, y);
		System.out.printf("%s", msg);

		String str = "Hello";
		int length = str.length();
		String so = "";
		for(int i=0; i<length; i=i+1) {
			char ch = str.charAt(i);
			if('a'<=ch && ch<='z') {
				char temp = (char)(ch-32);
				//so = so+temp;
				so = String.format("%s%c",so, temp);
			}else {
				so = String.format("%s%c",so, ch);
				//so = so+ch;
			}
		}
		System.out.printf("대문자:%s\n",so);
		
		//so 라는 문자열에 E의 위치를 확인
		int idx = so.indexOf('E');
		System.out.printf("E의 위치:%d\n", idx+1);
		//so 라는 문자열에 K의 위치를 확인
		//없으면 -1 반환
		idx = so.indexOf('K');
		System.out.printf("K의 위치:%d\n", idx);
	}

}
