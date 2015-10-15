
package practiceoop.Constructor;

//There is no copy constructor in java. But, we can copy the values of one object to another like copy constructor in C++.
//
//There are many ways to copy the values of one object into another in java. They are:
//
//By constructor
//By assigning the values of one object into another
//By clone() method of Object class
public class CopyConstructorStudent {
    
    int id;
    String name;

    public CopyConstructorStudent(int id,String name) {
        this.id=id;
        this.name = name;
    }
    
    public CopyConstructorStudent(CopyConstructorStudent s){
        this.id = s.id;
        this.name = s.name;
    }
    
    public void displayInfo(){
        System.out.println("ID "+id + "Name "+name);
    }
    public static void main(String[] args) {
        CopyConstructorStudent s1 = new CopyConstructorStudent(1,"Nimal");
        s1.displayInfo();
        CopyConstructorStudent s2 = new CopyConstructorStudent(s1);
        s2.displayInfo();
    }
    
}
