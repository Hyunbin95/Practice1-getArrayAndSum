package objecttest;

import java.math.BigDecimal;

public class WrapperMain {

	public static void main(String[] args) {
		//Wrapper Class: Value ���� �����͸� Reference ������ �����ϱ� ���� Ŭ����
		double d = 10.8;
		Double refDouble = new Double(d);
		System.out.println(d);
		System.out.println(refDouble);
		
		//�������� �����͸� value ������ ����
		double x = refDouble.doubleValue();
		System.out.println(x);
		
		//AutoBoxing �� AutoUnBoxing : �ٷ� ���� ����
		refDouble = d; // Reference ������ ��ȯ
		x = refDouble; // value ������ ��ȯ
		
		//���ڿ��� ���� �����ͷ� ��ȯ
		String str = "23.4";
		x = Double.parseDouble(str);
		System.out.println(x);
		//��ȯ�� �� ���� �����͸� ��ȯ�ϸ� NumberFormatException �߻�
		
		str = "7d9jk.kdi";
		//x = Double.parseDouble(str);
		System.out.println(x);
		
		//������ �����͸� �����ϱ� ���� BigDecimal Ŭ����
		BigDecimal bigDecimal = new BigDecimal("82.123154648798465465465");
		x = 82.123154648798465465465;
		System.out.println(x-1.0);
		System.out.println(bigDecimal);
	}

}
