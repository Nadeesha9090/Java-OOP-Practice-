/*
Java static method

If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.
*/
package practiceoop.StaticKeyWord;

public class ChangeUniversity {
    String name;
    static String  universityName = "RUSL";
    
   
    ChangeUniversity(String n){
        name = n;
    }
    
    void displayGraduatesInfo(){
        System.out.println("Name "+name);
        System.out.println("University Name "+ universityName+"\n\n");
    }
    
    static void changeUniName(){
        universityName = "Rajarata University of Sri Lanka";
    }
    public static void main(String[] args) {
        //A static method can be invoked without the need for creating an instance of a class.
        ChangeUniversity.changeUniName();
        
        ChangeUniversity student1 = new ChangeUniversity("Amara");
        student1.displayGraduatesInfo();  
        ChangeUniversity student2 = new ChangeUniversity("Nayana");
        student2.displayGraduatesInfo(); 
        ChangeUniversity student3 = new ChangeUniversity("Kamal");
        student3.displayGraduatesInfo(); 
    }
    
    /*
    1. The static method can not use non static data member or call non-static method directly.
    2. this and super cannot be used in static context.
    */
}
