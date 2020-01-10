package Loop;

import java.util.Scanner;

public class PrintingStarsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numOfStar = scanner.nextInt();
		scanner.close();
		for(int i=1; i<=numOfStar; i++) {
			for(int j=numOfStar; j-i>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
