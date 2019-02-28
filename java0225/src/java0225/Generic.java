package java0225;

public class Generic <T>{
	Generic <Integer> t1 = new Generic<Integer>();
}
/*
//Generic <int> t1 = new Generic<int>();
//제너릭의 자료형은 Reference 타입만 가능
//int 는 value 이라서 안됩니다.


public class Generic1 <T, V>{


Generic1 <String, Integer> t2 = new Generic1<String, Integer>();
}*/