package 백준_단계별로풀어보기_배열;

import java.util.Scanner;

public class _2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int number = 0;
		int[] array = new int[9];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
			if(max<array[i]) {
				max = array[i];
				number = i+1;
			}
		}
		
		System.out.println(max+"\n"+number);
		scanner.close();
	}

}
