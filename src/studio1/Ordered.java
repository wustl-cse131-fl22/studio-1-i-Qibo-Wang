package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
boolean isOrdered = (x>y & y>z)|(z>y & y>x);

//if(x>y) {
//	if(y>z) {
//		isOrdered=true;
//	}else {
//		isOrdered=false;
//	}
//}else if(z>y) {
//	if(y>x) {
//		isOrdered=true;
//	}else {
//		isOrdered=false;
//	}
//		
//}
System.out.print(isOrdered);
	}

}
