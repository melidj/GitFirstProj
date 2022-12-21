import java.util.Scanner;

class Tutorial_21_Constructor{
	
	String name;
	
	//constructor - name same as class name
	Tutorial_21_Constructor(){
		System.out.println("Welcome");
		name = "Melisha";
	}
	
	//method
	void meth(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args){
		Tutorial_21_Constructor obj = new Tutorial_21_Constructor();
		obj.meth();
		//After we create an object it automatically call constructor
		//just run & look at the output
		
		
		Tutorial_21_Constructor obje1 = new Tutorial_21_Constructor();
		System.out.println(obje1.name);
		
		//output
			
		/* 	Welcome
			Hello
			Welcome
			Melisha
		*/
	}
	
	
}