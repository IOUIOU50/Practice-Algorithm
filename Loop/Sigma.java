package Loop;

import java.util.Scanner;

public class Sigma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum +=i;
		}
		
		System.out.println(sum);
		
		scanner.close();
		/*In fact, using other algorithms to solve this problem can be more effective and easier.*/
		 
	}
}
