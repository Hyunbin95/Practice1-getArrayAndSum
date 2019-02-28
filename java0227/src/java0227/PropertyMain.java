package java0227;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//프로퍼티 저장을 위한 Properties 인스턴스를 생성
		Properties prop = new Properties();
		prop.setProperty("name", "bia");
		prop.setProperty("job", "머천다이저");
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
