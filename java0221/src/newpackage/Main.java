package newpackage;

public class Main {
	
	public static void main(String[] args) {
		//번호가 50493004이고 이름이 이현빈인 Data 인스턴스를 생성
		Data data1 = new Data(1,"아이린");
		
		//번호가 2이고 이름이 수지인 Data 인스턴스를 생성
		Data data2 = new Data(2, "수지");
	
		//data3이 1과 아이린을 저장
		Data data3 = new Data(1,"아이린");
		
		//data1, data2, data3 은 전부 new를 생성했기 때문에
		//새로운 메모리공간을 할당받았기 때문에 가리키고 있는 참조가 모두 다릅니다.
		//==는 저장하고 있는 데이터만 비교
		System.out.println("data 1 == data2 : " + (data1==data2));
		System.out.println("data 1 == data3 : " + (data1==data3));
		
		Data data4 = data1;
		System.out.println("data 1 == data4 : " + (data1==data4));
		
		System.out.println("data 1 equals data2 : " + data1.equals(data2));
		//data1과 data3는 변개로 만들어졌지만 num의 값이 같아서 true
		System.out.println("data 1 equals data3 : " + data1.equals(data3));
		
		//데이터 복제
		Data data5 = data1.clone();
		
		//참조를 복사한 경우는 어느 한쪽이 세부 데이터를 변경하면
		//다른쪽에 영향을 줍니다.
		data4.setName("설현");
		System.out.println(data1.getName());
		//복제를 해서 준 경우는 현재 데이터는 동일하지만 서로 다른 장소에
		//데이터를 가지고 있는 것이어서 어느 한쪽의 변경이 다른 데이터에
		//영향을 주지 않습니다.
		data5.setPh(12);
		System.out.println(data1.getPh());
		
		//문자열은 동일성을 확인할 때 ==를 사용하면 안되고 equals를 이용해야
		//합니다
		String id = "안녕";
		String copy = new String("안녕");
		System.out.println(id.contentEquals(copy));
		System.out.println(id == "안녕");
	}
}
