package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digit {
	public static void main(String args[]) throws IOException
	 {
	 BufferedReader br = new BufferedReader(new
	 InputStreamReader(System.in));
	 digit call = new digit();
	 System.out.print("Enter number : ");
	 int x = Integer.parseInt(br.readLine());
	 System.out.print("Enter power : ");
	 int y = Integer.parseInt(br.readLine());
	 System.out.println("\n" +x +"^" +y +" = "+call.findPower(x,y));
	 }
	 int findPower(int x, int y)
	 {
	 if(y==0)
	 return 1;
	 else if(y==1)
	 return x;
	 else
	 return x*findPower(x,y-1);
	 }
}