package java0213;

public class Practice {

	public static void main(String[] args) {
		
		for(int op = 0 ; op<5; op = op+1) {
			for(int op2=0; op2<=op; op2=op2+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int op=0; op<5; op=op+1) { 
			for(double op2=0; op2<=op; op2=op2+0.5) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		System.out.println();
		
		for(int op=5; 0<op; op=op-1) {
			for(int op2=0; op2<op; op2=op2+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}

