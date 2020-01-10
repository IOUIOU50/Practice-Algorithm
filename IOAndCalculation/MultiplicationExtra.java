package IOAndCalculation;

import java.util.Scanner;

public class MultiplicationExtra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer a = scanner.nextInt();
		Integer b = scanner.nextInt();
		
		System.out.println(a*(b%100%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		scanner.close();
	}

}
