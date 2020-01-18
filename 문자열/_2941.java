import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sb = br.readLine();
		StringBuffer str= new StringBuffer(10000);
		
		str.append(sb);
		int count=0;
		int i=0;
		while(i<str.length()) {
			count++;
			if(str.charAt(i)=='c') {
				if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-') {
					i++;
				}
			}
			else if(str.charAt(i)=='d') {
				if(str.charAt(i+1)=='-') {
					i++;
				}
				else if(str.charAt(i+1)=='z') {
					if(str.charAt(i+2)=='=')
						i+=2;
				}
			}
			else if(str.charAt(i)=='l') {
				if(str.charAt(i+1)=='j')
					i++;
			}
			else if(str.charAt(i)=='n') {
				if(str.charAt(i+1)=='j')
					i++;
			}
			else if(str.charAt(i)=='s') {
				if(str.charAt(i+1)=='=') {
					i++;
				}
			}
			else if(str.charAt(i)=='z') {
				if(str.charAt(i+1)=='=') {
					i++;
				}
			}
			i++;
		}
		
		bw.write(count);
		bw.close();
		br.close();
	}
}
