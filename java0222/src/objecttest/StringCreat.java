package objecttest;

public class StringCreat {

	public static void main(String[] args) {
		//String Ŭ������ ������ �ʴ� ���ڿ��� �����ϴ� Ŭ����
		//�۾��� �� �� ������ �����ؼ� �۾��� �����ϰ� ����� �����մϴ�.
		//+�� �̿��ؼ� �ٸ� ���ڿ��̳� ���ڸ� �ٿ��� �����մϴ�.
		
		String str = "�ݿ���";
		//�ؽ��ڵ� ���
		System.out.println(str.hashCode());
		str = str + "����";
		System.out.println(str.hashCode());
		
		//StringBuilder Ŭ������ ���ϴ� ���ڿ� ���忡 ����ϴ� Ŭ����
		//������ ������ �̸� Ȯ���صξ��ٰ� �ڱ� �ڽ����� �۾�
		StringBuilder sb = new StringBuilder("�ݿ���");
		System.out.println(sb.hashCode());
		sb.append("����");
		System.out.println(sb.hashCode());

	}
	
}
