class Adding{
//Method 1,2,3 is changing number of arguments	
	//Method  1
	void sum(int a,int b){
		int sum;
		sum = a + b ;
		
		System.out.println("Invoke Method 1 ");
		System.out.println("Sum ="+sum);
	}
	//Method  2	
	void sum(int a,int b,int c){
		int sum;
		sum = a + b + c ;
		
		System.out.println("Invoke Method 2 ");
		System.out.println("Sum ="+sum);
	}
	//Method  3
	void sum(int a,int b,int c,int d){
		int sum;
		sum = a + b + c + d;
		
		System.out.println("Invoke Method 3 ");
		System.out.println("Sum ="+sum);
	}
	
//Method 4,5 is changing the data type

	//Method  4	
	void sum(String a,String b){
		String sum;
		sum = a + b  ;
		
		System.out.println("Invoke Method 4 ");
		System.out.println("Sum ="+sum);
	}
	//Method  5
	void sum(double a,double b){
		double sum;
		sum = a + b ;
		
		System.out.println("Invoke Method 5 ");
		System.out.println("Sum ="+sum);
	}
}

class NumberOfArguments{
	public static void main (String args[]){
		Adding obj1 = new Adding();
		
		//Changing number of arguments
		obj1.sum(1,2);
		obj1.sum(1,2,3);
		obj1.sum(1,2,3,4);
		
		//changing the types of arguments
		obj1.sum("Method","Overloading");
		obj1.sum(1.2,2.3);
		
	}
	
}
	
