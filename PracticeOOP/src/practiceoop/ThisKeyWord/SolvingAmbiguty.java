package practiceoop.ThisKeyWord;

public class SolvingAmbiguty {
    int id ;
    String name;

    SolvingAmbiguty(int id ,String name) {
        /*id = id;
        name = name; 
        This leads to an ambiguty */
        
        
        /*Using this keyword we can solve the ambiguty*/
        this.id=id;
        this.name = name;
    }
    
    void displayInfo(){
        System.out.println("Id "+id );
        System.out.println("Name "+name);
    }
    
    public static void main(String[] args) {
        SolvingAmbiguty obj1 = new SolvingAmbiguty(1,"Nimal");
        SolvingAmbiguty obj2 = new SolvingAmbiguty(2,"Kamal");
        
        obj1.displayInfo();
        obj2.displayInfo();
    }
    
}
