import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner argument = new Scanner(System.in);
		System.out.print("enter a	");
		double a = argument.nextDouble();
		System.out.print("enter b	");
		double b = argument.nextDouble();
		System.out.print("enter operation	");
		String operation = argument.next();
		double c = 0;
		Operations o = new Operations(a, b);
		switch (operation) {
			case "+": c = o.addition(a, b); output(a, b, c, operation); break;
			case "-": c = o.subtraction(a, b); output(a, b, c, operation); break;
			case "*": c = o.multiplication(a, b); output(a, b, c, operation); break;
			case "/": 
				if(b != 0) { 
					c = o.division(a, b); output(a, b, c, operation); break;
			}
				else {
					System.out.print("Invalid operation. Try again"); break;
			}
			default: System.out.print("Invalid operation. Try again"); break;
		}
		
	}
	
	public static void output(double a, double b, double c, String operation) {
		System.out.print(a + " " + operation + " " + b + " = " + c );	}
}
