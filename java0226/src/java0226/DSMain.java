package java0226;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class DSMain {

	public static void main(String[] args) {
		//문자열을 저장할 수 있는 스택을 생성
		//Stack:LIFO(Last IN First Out)
		Stack <String> stack = new Stack<String>();

		
		//데이터 저장
		stack.push("프로그래밍 언어");
		stack.push("자료구조");
		stack.push("알고리즘");
		stack.push("디자인패턴");
		stack.push("데이터베이스");
		stack.push("Front-End");
		
		//데이터 꺼내서 출력하기
		String data = stack.pop();
		//가장 마지막에 삽입한 Front-End가 출력됩니다.
		System.out.println(data);
		
		for(String temp : stack) {
			System.out.println(temp);
		}
		System.out.println(stack);

		System.out.println("======================");
		
		//Queue - FIFO(First In First OUT)
		//PriorityQueue는 데이터를 오름차순 정렬한 큐
		//PriorityQueue가 이진트리합니다.
		//PriorityQueue는 정말로 정렬을 하는 것이 아니고 데이터를 삽입하면서 정렬된 것처럼 트리 구조로 저장합니다.
		//데이터를 저장하고 하나씩 poll을 순서대로 나오지만
		//한꺼번에 출력하면 출력순서를 알 수 없습니다.
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("5");
		queue.add("3");
		queue.add("2");
		queue.add("4");
		queue.add("1");
		queue.add("6");
		queue.add("7");
		//데이터 꺼내기
		//data = queue.poll();
		//System.out.println(data);
		
		for(String temp : queue) {
			System.out.println(temp);
		}
		
	
	
	//Deque: 양쪽에서 데이터를 삽입하고삭제할 수 있는 자료구조
	//Deque는 인터페이스이고 이를 구현한 클래스가 ArrayDeque
	ArrayDeque<String> ad = new ArrayDeque<String>();
	ad.addFirst("Encapsulation(캡슐화)");
	ad.addFirst("Inheritance(상속)");
	ad.addFirst("Polymorphism(다형성)");
	System.out.printf("마지막 데이터:%s\n", ad.getLast()); //제일 오래된거
	System.out.printf("첫번째 데이터:%s\n", ad.getFirst());//제일 최근거
	}
}
