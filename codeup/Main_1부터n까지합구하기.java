package codeup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1부터n까지합구하기 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(f(N));
		
	}
	
	public static int f(int n) {
		if(n==1) return 1;
		return n+f(n-1);
	}

}
