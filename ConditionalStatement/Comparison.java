package ConditionalStatement;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sub = scanner.nextInt() - scanner.nextInt();
		
		if(sub==0)
			System.out.println("==");
		else if(sub>0)
			System.out.println(">");
		else if(sub<0)
			System.out.println("<");
		
		scanner.close();
	}
}
