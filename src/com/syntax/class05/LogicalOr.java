package com.syntax.class05;

public class LogicalOr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//true||true--->True
		//true|| false--->true
		//false|| true--->true
		//false||false--->false
		
		//
String day="Thursday";
if(day.equals("Monday")|| day.equals("Friday")) {
	System.out.println("I have no class");
	
}else if(day.equals("Tuesday")|| day.equals("Wednesday")){
	System.out.println("I have manual testing class");
	
}else if(day.equals("Thursday")){
	System.out.println("I have Review class");
	
}else if(day.equals("Saturday")|| day.equals("Sunday")) {
	System.out.println("I have Java Class");
	
	

}
}
}