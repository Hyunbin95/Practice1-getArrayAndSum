package java0228;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatStringMain {
	
	public static void main(String[] args) {
		//Calendar 인스턴스를 이용한 Date 인스턴스를 생성
		Calendar cal = Calendar.getInstance();
		Date today = new Date(cal.getTimeInMillis());
		
		//날짜서식을 생성
		SimpleDateFormat sdf = 
				new SimpleDateFormat("G YYYY-MM-dd hh:mm:ss (EEE)");
		//날짜를 문자열로 전환
		String formatString = sdf.format(today);
		System.out.println(formatString);
		
		double number = 67532.76542;
		//위의 숫자는 \67,532.77 로 출력하기
		//숫자 서식을 설정
		DecimalFormat df =
				new DecimalFormat("\u00A4 #,###.00");
		formatString = df.format(number);
		System.out.println(formatString);
		
		//ChoiceFormat은 실수 배열과 문자열 배열을 이용해서 생성
		//실수 배열 안의 숫자 범위에 해당하는 문자열을 리턴하는 클래스
		double [] score = {0,60,70,80,90};
		String [] grade = {"가", "양", "미", "우", "수"};
		
		double [] jumsu = {98,87,26,56,76,88};
		//ChoiceFormat 인스턴스 생성
		ChoiceFormat cf = new ChoiceFormat(score, grade);
		for(double temp : jumsu) {
			System.out.println(cf.format(temp));
		}
		
		//포맷 문자열 생성
		String msg = "이름:{0} 나이:{1}";
		Object [] p1 = {"이현빈", "25"};
		Object [] p2 = {"그녀", "21"};
		
		System.out.printf("%s\n", MessageFormat.format(msg, p1));
		System.out.printf("%s\n", MessageFormat.format(msg, p2));
		
		}

}
