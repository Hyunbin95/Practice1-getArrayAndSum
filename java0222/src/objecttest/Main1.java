package objecttest;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String osName = System.getProperty("os.name");
			String userName = System.getProperty("user.name");
			String userHome = System.getProperty("user.home");
			String javaHome = System.getProperty("java.home");
			String javaVersion = System.getProperty("java.version");
			System.out.println("�ü�� �̸�: " + osName);
			System.out.println("����� �̸�: " + userName);
			System.out.println("����� Ȩ���丮: " + userHome);
			System.out.println("�ڹ� ���丮: " + javaHome);
			System.out.println("�ڹ� ����: " + javaVersion);
			String path = System.getenv("path");
			System.out.println("[ path ] " + path);
	}

}
