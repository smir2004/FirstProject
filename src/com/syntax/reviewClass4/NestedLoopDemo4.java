package com.syntax.reviewClass4;

public class NestedLoopDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f=1;
while(f<=3) {
	int c=1;// loop inside another loop
	while(c<=2) {
		System.out.println(c);
		c++;
	}
	f++;
}
	}

}
