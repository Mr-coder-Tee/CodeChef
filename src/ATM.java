import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ATM {

	public static void main(String[] args) {
		
		// HS08TEST
		double X,Y;
		FastScanner ft=new FastScanner();
		
		X=ft.nextDouble();
		Y=ft.nextDouble();
		
		
		
		if(X%5==0&&(X+0.5)<Y) {
			System.out.println(Y-X-0.5);
			
		}else {
			System.out.println(Y);
		}

	}

}
class FastScanner{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer("");
	String next() {
		while(!st.hasMoreTokens()) {
			try {
				st=new StringTokenizer(br.readLine());
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		return st.nextToken();
	}
	
	double nextDouble() {
		return Double.parseDouble(next());
	}
	
}
