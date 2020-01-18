import java.util.Arrays;
import java.util.Scanner;

public class _1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		//문자열 입력
		String str = sc.next(); 
		sc.close(); 
		
		//a~z까지 알파벳 26자의 빈도 수를 저장하는 배열 arr
		//인덱스 0에 a부터 인덱스 25에 z까지 빈도 수를 저장
		int[] arr = new int[26]; 
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i); //문자 검사
			
			if(c<91) { //아스키 코드와 대조하여 해당 문자가 대문자일 경우
				arr[c-65]++;
			}
			else { //아스키 코드와 대조하여 해당 문자가 소문자일 경우
				arr[c-97]++;
			}
		}
		char max = 0;
		int maxIndex=0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[maxIndex]<arr[i])
				maxIndex= i;
		}
		
		max = (char)(65+maxIndex);
		Arrays.sort(arr);
		if(arr[25]==arr[24])
			System.out.println("?");
		else
			System.out.println(max);
	}
}
