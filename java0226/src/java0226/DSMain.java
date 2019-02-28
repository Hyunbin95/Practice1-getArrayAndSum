package java0226;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class DSMain {

	public static void main(String[] args) {
		//���ڿ��� ������ �� �ִ� ������ ����
		//Stack:LIFO(Last IN First Out)
		Stack <String> stack = new Stack<String>();

		
		//������ ����
		stack.push("���α׷��� ���");
		stack.push("�ڷᱸ��");
		stack.push("�˰���");
		stack.push("����������");
		stack.push("�����ͺ��̽�");
		stack.push("Front-End");
		
		//������ ������ ����ϱ�
		String data = stack.pop();
		//���� �������� ������ Front-End�� ��µ˴ϴ�.
		System.out.println(data);
		
		for(String temp : stack) {
			System.out.println(temp);
		}
		System.out.println(stack);

		System.out.println("======================");
		
		//Queue - FIFO(First In First OUT)
		//PriorityQueue�� �����͸� �������� ������ ť
		//PriorityQueue�� ����Ʈ���մϴ�.
		//PriorityQueue�� ������ ������ �ϴ� ���� �ƴϰ� �����͸� �����ϸ鼭 ���ĵ� ��ó�� Ʈ�� ������ �����մϴ�.
		//�����͸� �����ϰ� �ϳ��� poll�� ������� ��������
		//�Ѳ����� ����ϸ� ��¼����� �� �� �����ϴ�.
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("5");
		queue.add("3");
		queue.add("2");
		queue.add("4");
		queue.add("1");
		queue.add("6");
		queue.add("7");
		//������ ������
		//data = queue.poll();
		//System.out.println(data);
		
		for(String temp : queue) {
			System.out.println(temp);
		}
		
	
	
	//Deque: ���ʿ��� �����͸� �����ϰ������ �� �ִ� �ڷᱸ��
	//Deque�� �������̽��̰� �̸� ������ Ŭ������ ArrayDeque
	ArrayDeque<String> ad = new ArrayDeque<String>();
	ad.addFirst("Encapsulation(ĸ��ȭ)");
	ad.addFirst("Inheritance(���)");
	ad.addFirst("Polymorphism(������)");
	System.out.printf("������ ������:%s\n", ad.getLast()); //���� �����Ȱ�
	System.out.printf("ù��° ������:%s\n", ad.getFirst());//���� �ֱٰ�
	}
}
