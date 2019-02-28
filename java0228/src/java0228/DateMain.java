package java0228;

import java.util.Calendar;
//import java.sql.Date 데이터 베이스 연동할 때 사용
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {
	
	public static void main(String[] args) {
		//현재 날짜 및 시간을 갖는 Date 인스턴스 생성하기
		Date today = new Date();
		//toString이 재정의 되어 있어서 바로 출력하면 저장된 데이터 확인이 가능
		//System.out.println(today);
		
		//년 월일을 직접 입력해서 생성 - Deprecated
		//년도는 1900년 이후의 지나온 년도 월은 0부터 시작
		//1972년 6월 29일 월은 -1해서 대입해야 올바르게 출력되기 때문에 6대신 5를 대입했습니다.
		Date birth = new Date(1972, 5, 29);
		System.out.println(birth);
		
		//현재 날짜 및 시간을 갖는 Calendar 인스턴스 생성
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		//System.out.println(now);
		//System.out.println(cal);
		
		//특정한 날짜 및 시간 만들기
		//1986년 5월 5일 13시 00분 00초 만들기
		//하나씩 설정하기 - 한꺼번에 설정하는 메소드도 존재
		//GregorianCalendar의 생성자를 이용해서 한번에 생성 가능
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, 7); //월은 0부터시작
		cal.set(Calendar.DAY_OF_MONTH, 28);
		cal.set(Calendar.HOUR, 17);

		
		//now에서 cal까지 지나온 날짜 수 계산
		long gap = now.getTimeInMillis() - cal.getTimeInMillis();
		gap = gap / 1000 / 86400; //1000 = 초 86400 = 1초*86400 = 1일
		System.out.println("종남이와 인영이가 만난지 대충 " + gap + "일♥");
		
	}

}
