package 백준_단계별로풀어보기_배열;

import java.util.Scanner;

public class _3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		boolean[] array = new boolean[42];
		int count = 0;
		int rest;
		for(int i=0; i<10; i++) {
			rest = scanner.nextInt()%array.length;
			if(!array[rest]) {
				array[rest] = true;
				count++;
			}
		}
		System.out.println(count);
		
		scanner.close();
	}

}
