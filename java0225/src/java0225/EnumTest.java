package java0225;

enum MultiMedia{
	None, Text, Video, Audio;
}

public class EnumTest {

	public static void main(String[] args) {
		//MultiMedia Ÿ������ ������ �����ϰ� ���� �Ҵ�
		MultiMedia m = MultiMedia.Audio;
		//����� �ϸ� �̸� �״�� ���
		System.out.println(m);
		//�ε����� ���
		System.out.println(m.ordinal());

	}

}