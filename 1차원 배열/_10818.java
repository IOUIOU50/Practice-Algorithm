package 백준_단계별로풀어보기_배열;

import java.util.Arrays;
import java.util.Scanner;

public class _10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int[] array = new int[num];
		
		for(int i=0; i<num; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.sort(array);
		
		System.out.println(array[0]+" "+array[num-1]);
	}

}
