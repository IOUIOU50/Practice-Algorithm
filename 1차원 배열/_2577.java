package 백준_단계별로풀어보기_배열;

import java.util.Scanner;

public class _2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] array;
		
		String mul = Integer.toString(scanner.nextInt() * scanner.nextInt() * scanner.nextInt());
		array = new int[10];
		
		for(int i=0; i<mul.length(); i++) {
			array[Integer.parseInt(Character.toString(mul.charAt(i)))]++;
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		scanner.close();
	}

}
