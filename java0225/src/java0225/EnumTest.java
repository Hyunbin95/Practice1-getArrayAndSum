package java0225;

enum MultiMedia{
	None, Text, Video, Audio;
}

public class EnumTest {

	public static void main(String[] args) {
		//MultiMedia 타입으로 변수를 선언하고 값을 할당
		MultiMedia m = MultiMedia.Audio;
		//출력을 하면 이름 그대로 출력
		System.out.println(m);
		//인덱스를 출력
		System.out.println(m.ordinal());

	}

}