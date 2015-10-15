
package practiceoop.Constructor;

public class CopyWithoutConstructor {

    int id;
    String name;
    
    CopyWithoutConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private CopyWithoutConstructor() {
       
    }
    
     public void displayInfo(){
        System.out.println("ID "+id + "Name "+name);
    }
     
     public static void main(String[] args) {
        CopyWithoutConstructor s1 = new CopyWithoutConstructor(1,"Nimal");
        s1.displayInfo();
        CopyWithoutConstructor s2 = new CopyWithoutConstructor();
        s2.id =s1.id;
        s2.name = s1.name;
        s2.displayInfo();
    }
}
