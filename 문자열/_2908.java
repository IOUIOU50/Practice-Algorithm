import java.util.Scanner;

public class _2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		StringBuffer sb1 = new StringBuffer(sc.next());
		StringBuffer sb2 = new StringBuffer(sc.next());
		
		if(Integer.parseInt(sb1.reverse().toString())>Integer.parseInt(sb2.reverse().toString()))
			System.out.println(sb1);
		else
			System.out.println(sb2);
		
		sc.close();
	}

}
