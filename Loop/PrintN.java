package Loop;

import java.util.Scanner;

public class PrintN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i=1; i<=n; i++)
			System.out.println(i);
		
		scanner.close(); 
	}
}
