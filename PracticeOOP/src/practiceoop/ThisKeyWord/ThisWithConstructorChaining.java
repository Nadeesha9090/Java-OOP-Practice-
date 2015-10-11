
package practiceoop.ThisKeyWord;


public class ThisWithConstructorChaining {
    int id;
    String name;
    double weight;
    ThisWithConstructorChaining(){
        System.out.println("Default Constructor invoked c1");
    }
    
    ThisWithConstructorChaining(int id ){
        this();
        System.out.println(" Constructor 2 invoked ");
        this.id = id;
    }
    
    ThisWithConstructorChaining(String name){
        this();
        System.out.println(" Constructor 3 invoked ");
        this.name = name;
    }
    
    ThisWithConstructorChaining(double weight){
        this();
        System.out.println(" Constructor 4 invoked ");
        this.weight = weight;
    }
    
    void display(){
        System.out.println("Name"+name+"id"+id+"weight"+weight);
    }
    public static void main(String[] args) {
        ThisWithConstructorChaining obj1 = new ThisWithConstructorChaining(1);
        obj1.display();
        
        ThisWithConstructorChaining obj2 = new ThisWithConstructorChaining("Muru");
        obj2.display();
        
        ThisWithConstructorChaining obj3 = new ThisWithConstructorChaining(45.6);
        obj3.display();
    }
}
