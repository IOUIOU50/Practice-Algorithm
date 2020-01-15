package ¼¿ÇÁ³Ñ¹ö;

public class _4673 {
	static boolean[] array = new boolean[10000];
	
	public static void main(String[] args) {
		for(int i=1; i<=10000; i++) {
			method(i);
		}
		
		
		for(int i=1; i<array.length; i++) {
			if(!array[i])
				System.out.println(i);
		}
	}
	
	public static void method(int a) {
		int num = a;
		if(num<10) {
			num = num*2;
		}
		else if(num < 100) {
			num = num + (num/10) + (num%10);
		}
		
		else if(num<1000) {
			num = num + (num/100) + (num%100/10) + (num%10);
		}
		
		else if(num<10000) {
			num = num + (num/1000) + (num%1000/100) + (num%100/10) + (num%10);
		}
		
		else {
			return;
		}
		if(num<10000)
			array[num] = true;
		method(num);

	}
}
