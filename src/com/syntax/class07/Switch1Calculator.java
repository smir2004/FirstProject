package com.syntax.class07;
import java.util.Scanner;
public class Switch1Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x=scan.nextInt();
		double y=scan.nextInt();
System.out.println("Please enter operator");
char op =scan.next().charAt(0);
double result=0;
String operator=null;
switch(op) {
case '*':
result = x*y;
break;
case'/':
result =x/y;
break;
case '+':
result =x+y;
break;
case'_':
      result = x-y;
    break;
default:
		System.out.println("Invalid Operator");
		operator="invalid";
}
if (result!=0 || !operator.equals("Invalid")) {
System.out.println(x + "" +op+""+y+"="+result);
}
	scan.close();
	}



}
