
public class StringFormat {

	public static void main(String[] args) {
		//String.format �޼ҵ�� System.out.printf �� ������ ������� ���
		//������� �ʰ� ���ڿ��� �����Ѵٴ� ���� �ٸ��ϴ�.
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
		System.out.printf("�빮��:%s\n",so);
		
		//so ��� ���ڿ��� E�� ��ġ�� Ȯ��
		int idx = so.indexOf('E');
		System.out.printf("E�� ��ġ:%d\n", idx+1);
		//so ��� ���ڿ��� K�� ��ġ�� Ȯ��
		//������ -1 ��ȯ
		idx = so.indexOf('K');
		System.out.printf("K�� ��ġ:%d\n", idx);
	}

}
