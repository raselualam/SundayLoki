package com.upskill.java_1;

public class Variables {
	
//	Variables in Java
	
	public String country = "USA";				//Instance OR global variable - Variables declared in Class level, outside method
	
	public String country2 = "Russia";
	
	public static String region = "America";	//Static variable - variables belong to class and don't required creating object

	public static void main(String[] args) {
		
		String city = "New York";				//Local variable - variables declared in methods 
		
		method5("Essex");
		
	}
	
	public static void method5(String county){	//Method parameter - variables used as method parameter
		
		String city = "Bloomfield";
		
		String myCounty = county;
		 
		System.out.println("My County - " + myCounty);
		
		
	}
	
	
	public void test(){
		
	}

}
