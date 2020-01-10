package Loop;

import java.util.Scanner;

public class LoopAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		int testCase = scanner.nextInt();
		for(int i=0; i<testCase; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a+b);
		}
		
		scanner.close();
	}
}
