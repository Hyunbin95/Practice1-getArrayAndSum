package java0227;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//������Ƽ ������ ���� Properties �ν��Ͻ��� ����
		Properties prop = new Properties();
		prop.setProperty("name", "bia");
		prop.setProperty("job", "��õ������");
		prop.setProperty("age", "26");
		prop.setProperty("place", "department");
	
		try {
			prop.store(new FileOutputStream(
					"C:\\Users\\503_12\\Desktop\\text.txt"), "irin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
