import java.util.Arrays;
import java.util.Scanner;

public class _1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		//���ڿ� �Է�
		String str = sc.next(); 
		sc.close(); 
		
		//a~z���� ���ĺ� 26���� �� ���� �����ϴ� �迭 arr
		//�ε��� 0�� a���� �ε��� 25�� z���� �� ���� ����
		int[] arr = new int[26]; 
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i); //���� �˻�
			
			if(c<91) { //�ƽ�Ű �ڵ�� �����Ͽ� �ش� ���ڰ� �빮���� ���
				arr[c-65]++;
			}
			else { //�ƽ�Ű �ڵ�� �����Ͽ� �ش� ���ڰ� �ҹ����� ���
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
