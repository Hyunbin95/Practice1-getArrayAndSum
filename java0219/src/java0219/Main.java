
package java0219;

public class Main {

	public static void main(String[] args) {
		/*
		 * //MethodClass의 Instance 생성 MethodClass instance = new MethodClass();
		 * MethodClass2 it = new MethodClass2(); //return 이 없는 메소드 호출 - 여기서 흐름 중단
		 * instance.addNoReturn(100, 200); //메소드 안에서 메소드를 호출하기 - 가능하지만 하지 않는 것이 좋습니다.
		 * System.out.println(instance.addReturn(instance.addReturn(100,200),300));
		 * 
		 * //작은 연산을 수행할 때는 recursion이 별 문제가 없지만 //많은 연산을 수행하는 경우 메모리가 부족해지거나 연산속도가
		 * 느려집니다. System.out.println(instance.sumNoRecursion(10));
		 * System.out.println(instance.sumRecursion(10));
		 * 
		 * System.out.println(instance.fibonacci(15));
		 * 
		 * //static 메소드를 호출할 때는 클래스 이름으로 호출 MethodClass2.staticMethod(); it.thisTest();
		 * 
		 * double r = 10*Math.random(); System.out.println((int)r);
		 * 
		 * java.util.Random random = new java.util.Random(); int r2 = random.nextInt();
		 * System.out.println(r2);
		 */

		// 인스턴스 생성
		// 앞에 사용한 이름은 클래스이름이고 뒤에 사용한이름은 생성자 이름
		/*
		ConstructorClass obj = new ConstructorClass();
		obj.setNum(1);
		obj.setName("이현빈");
		System.out.println("obj1의 num: " + obj.getNum());

		ConstructorClass obj2 = new ConstructorClass();
		obj2.setNum(2);
		obj2.setName("수지");
		System.out.println(obj.getName() + " " + obj2.getName());

		ConstructorClass obj3 = new ConstructorClass(3, "95년생 이현빈");
		System.out.println(obj3.getNum() + " " + obj3.getName());
		*/
		/*
		Based b = new Based();
		//하위 클래스에서는 상위 클래스의 멤버를 전부 물려받습니다.
		Drived d = new Drived();
		d.superMethod();
		d.commonMethod();
		d.subMethod();
		 */
		Based b = new Based();
		//상위 클래스 타입으로 만들어진 참조형 변수에 하위 클래스 타입의 인스턴스를 대입할 수 있습니다.
		Based x = new Drived();
		
		
		//하위 클래스 타입으로 만들어진 참조형 변수에 상위 클래스 타입의
		//인스턴스 참조를 대입할 수는 없습니다.
		//이 때는 강제 형 변환을 해서 대입해야 합니다.
		
		//에러는 아니지만 실행하면 예외가 발생
		//원래의 자료형이 Based 이기 때문입니다.
		//Drived d = (Drived)new Based();
		
		//인스턴스를 생성할 때 하위 클래스 타입으로 만든 경우는
		//원래의 자료형으로 형 변환해도 에러가 발생하지 않습니다.
		Drived d = (Drived)x;
	}
}
