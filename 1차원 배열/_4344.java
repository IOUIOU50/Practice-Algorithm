package 백준_단계별로풀어보기_배열;

import java.util.Scanner;

public class _4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int numOfStudent = scanner.nextInt();
			int[] grade = new int[numOfStudent];
			int sum = 0;
			for(int j=0; j<numOfStudent; j++) {
				grade[j] = scanner.nextInt();
				sum += grade[j];
			}
			double average = sum/numOfStudent;
			
			int count = 0;
			for(int j=0; j<numOfStudent; j++) {
				if(grade[j]>average)
					count++;	
			}
			
//			System.out.println((double)count/numOfStudent*100+"%");
//			System.out.println((double)Math.round((double)count/numOfStudent*100*1000)/1000.0+"%");
			System.out.printf("%.3f", 100.0*count/numOfStudent);
			System.out.println("%");

		}
		
		scanner.close();
	}

}
