package Demo;

import java.util.Scanner;

public class Demo_TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Take six variables as one of each byte, short, int, long, float and double. Initialize only byte
		and short asking the value from the user.
		Take byte & short variables and store their sum in the integer variable and print the sum
		and then take short and int and store their addition in a long variable and now take an int
		and long and so on.
		6. Expected Output
		The sum of each pair should be displayed on the eclipse*/
		
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextByte();
		b=sc.nextShort();
		//int=byte + short
		c=a+b;
		
		System.out.println("int=byte+short=" +c);
		//short + int 
		
		d=b+c;
		
		System.out.println("long=int+short=" +d);
		
		//int+long
		
		e=c+d;
		System.out.println("float=int+long" +d);
		
		f=d+e;
		System.out.println("double=long+float" +c);
		
		
		

	}

}
