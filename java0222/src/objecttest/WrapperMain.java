package objecttest;

import java.math.BigDecimal;

public class WrapperMain {

	public static void main(String[] args) {
		//Wrapper Class: Value 형의 데이터를 Reference 형으로 저장하기 위한 클래스
		double d = 10.8;
		Double refDouble = new Double(d);
		System.out.println(d);
		System.out.println(refDouble);
		
		//참조형의 데이터를 value 형으로 변경
		double x = refDouble.doubleValue();
		System.out.println(x);
		
		//AutoBoxing 과 AutoUnBoxing : 바로 대입 가능
		refDouble = d; // Reference 형으로 변환
		x = refDouble; // value 형으로 변환
		
		//문자열을 숫자 데이터로 변환
		String str = "23.4";
		x = Double.parseDouble(str);
		System.out.println(x);
		//변환할 수 없는 데이터를 변환하면 NumberFormatException 발생
		
		str = "7d9jk.kdi";
		//x = Double.parseDouble(str);
		System.out.println(x);
		
		//정밀한 데이터를 보관하기 위한 BigDecimal 클래스
		BigDecimal bigDecimal = new BigDecimal("82.123154648798465465465");
		x = 82.123154648798465465465;
		System.out.println(x-1.0);
		System.out.println(bigDecimal);
	}

}
