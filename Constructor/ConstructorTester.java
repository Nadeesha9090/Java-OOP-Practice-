class ConstructorTester{
	
	int id ;
	String color;
	double weight;
	
	//Default One -> Constructor that has no parameter is the default one & it's usually invoke when object is creating 
	//If there is no constructor in a class, compiler automatically creates a default constructor.
	//If you are not going to do constructor overloading no need to add default constructor manually.
	ConstructorTester(){
		
		System.out.println("Default constructor is invoked");
		System.out.println("Object is Created");
	}
	
	//Overloaded Constructor 1 
	ConstructorTester(int  i,String c){
		id = i;
		color = c;
		System.out.println("Overloaded constructor 1 is invoked");
	
	}
	//Overloaded Constructor 2	
	ConstructorTester(int i,String c,double w){
		id = i;
		color = c;
		weight = w;
		System.out.println("Overloaded constructor 2 is invoked");
	}
	
	//Display Object Details Method 
	void displayDetails(){
		System.out.println("Object id ="+ id +"\n"+"Object Color ="+color+"\n"+"Object Weight ="+weight);
	}
	
	
	public static void main (String args[]){
		
		//Creating Objects
		ConstructorTester obj1 = new ConstructorTester();
		ConstructorTester obj2 = new ConstructorTester(1,"Red");
		ConstructorTester obj3 = new ConstructorTester(2,"Green",4.5);
		
		
		//Dispalying Object Information
		obj1.displayDetails();
		obj2.displayDetails();
		obj3.displayDetails();

	}
	
}
	
