package ConditionalStatement;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if(minute<45) {
			if(hour==0) {
				System.out.println("23 " + (minute+60-45));
			}
			else {
				System.out.println(hour-1 + " " + (minute+60-45));
			}
		}
		else {
			if(hour==0) {
				System.out.println("23 " + (minute-45));
			}
			else
				System.out.println(hour + " " + (minute-45));
		}
	}
}
