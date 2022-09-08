package studio1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Please input your year:");
int a = in.nextInt();
boolean isleapyear = ((a%4==0)&&(a%100!=0))|(a%400==0);
System.out.println(a+" is a leap year:"+isleapyear);
	}

}
