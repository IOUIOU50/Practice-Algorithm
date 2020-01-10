package Loop;

import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int table = scanner.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.println(table+" * "+(i+1)+" = "+table*(i+1));
		}
		
		scanner.close();
	}

}
