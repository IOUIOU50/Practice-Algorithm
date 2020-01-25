import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2941_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().trim();
		int count=0;
		int i;
		for(i=0; i<str.length(); i++) {
			count++;
			if(str.charAt(i)=='c') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-')
						i++;
				}
			}
			else if(str.charAt(i)=='d') {
				if(i<str.length()-1 && str.charAt(i+1)=='-') {
					i++;
				}
				else if(i<str.length()-1 && str.charAt(i+1)=='z') {
					if(i<str.length()-2 && str.charAt(i+2)=='=')
						i+=2;
				}
			}
			else if(str.charAt(i)=='l') {
				if(i<str.length()-1 && str.charAt(i+1)=='j')
					i++;
			}
			else if(str.charAt(i)=='n') {
				if(i<str.length()-1 && str.charAt(i+1)=='j')
					i++;
			}
			else if(str.charAt(i)=='s') {
				if(i<str.length()-1 && str.charAt(i+1)=='=') {
					i++;
				}
			}
			else if(str.charAt(i)=='z') {
				if(i<str.length()-1 && str.charAt(i+1)=='=') {
					i++;
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
