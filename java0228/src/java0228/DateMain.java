package java0228;

import java.util.Calendar;
//import java.sql.Date ������ ���̽� ������ �� ���
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {
	
	public static void main(String[] args) {
		//���� ��¥ �� �ð��� ���� Date �ν��Ͻ� �����ϱ�
		Date today = new Date();
		//toString�� ������ �Ǿ� �־ �ٷ� ����ϸ� ����� ������ Ȯ���� ����
		//System.out.println(today);
		
		//�� ������ ���� �Է��ؼ� ���� - Deprecated
		//�⵵�� 1900�� ������ ������ �⵵ ���� 0���� ����
		//1972�� 6�� 29�� ���� -1�ؼ� �����ؾ� �ùٸ��� ��µǱ� ������ 6��� 5�� �����߽��ϴ�.
		Date birth = new Date(1972, 5, 29);
		System.out.println(birth);
		
		//���� ��¥ �� �ð��� ���� Calendar �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		//System.out.println(now);
		//System.out.println(cal);
		
		//Ư���� ��¥ �� �ð� �����
		//1986�� 5�� 5�� 13�� 00�� 00�� �����
		//�ϳ��� �����ϱ� - �Ѳ����� �����ϴ� �޼ҵ嵵 ����
		//GregorianCalendar�� �����ڸ� �̿��ؼ� �ѹ��� ���� ����
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, 7); //���� 0���ͽ���
		cal.set(Calendar.DAY_OF_MONTH, 28);
		cal.set(Calendar.HOUR, 17);

		
		//now���� cal���� ������ ��¥ �� ���
		long gap = now.getTimeInMillis() - cal.getTimeInMillis();
		gap = gap / 1000 / 86400; //1000 = �� 86400 = 1��*86400 = 1��
		System.out.println("�����̿� �ο��̰� ������ ���� " + gap + "�Ϣ�");
		
	}

}
