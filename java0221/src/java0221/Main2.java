package java0221;

public class Main2 {

	public static void main(String[] args) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		try {
		String str = "Hello World";
		//강제로 NumberFormatException을 발생시킴
		throw new NumberFormatException();
		
		//NullPointerException 발생
		//System.out.printf("%s\n", str.toUpperCase());
		//정수로 변경하려다가 예외 발생 - NumberFormatException
		//int n1 = Integer.parseInt("T_T");
		}
		/*
		//NullPointerException이 발생했을 때 호출되는 블럭
		catch(NullPointerException e) {
			System.err.printf("널 포인터 예외 발생\n");
		}
		
		//NumberFormatException 처리
		catch(NumberFormatException e) {
			System.err.printf("정수로 변환을 하지 못하는 예외 발생\n");
		}
		*/
		
		/*
		//2개의 예외를 |로 묶어서 처리
		catch(NumberFormatException | NullPointerException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		*/
		
		//상위 클래스의 참조형 변수에는 하위 클래스 타입의 인스턴스 참조를
		//대입할 수 있습니다.
		//NumberFormatException 클래스와 NullPointerException 클래스는
		//모두 RuntimeException 클래스로부터 상속받았기 때문에
		//RuntimeEsception 클래스의 참조형 변수에 대입이 가능합니다.
		//RuntimeEsception 클래스는 Exception 클래스로부터 상속받았으므로
		//Exception으로 수정해도 동일한 결과가 나옵니다.
		
		catch(RuntimeException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		/*
		//도달할 수 없는 코드라서 에러가 생김
		catch(NumberFormatException | NullPointerException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		*/
		
		//예외 발생 여부에 상관없이 수행
		finally {
		System.out.printf("무조건 수행\n");
		}
		System.out.println("프로그램종료");
	}
	
}