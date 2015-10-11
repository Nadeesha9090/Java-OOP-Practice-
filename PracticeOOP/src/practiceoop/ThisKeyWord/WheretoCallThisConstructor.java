
package practiceoop.ThisKeyWord;

public class WheretoCallThisConstructor {
    
    int id;
    String name;
    String school;
    
    WheretoCallThisConstructor(int id, String  name){
        this.id = id;
        this.name = name;
    }
    
    WheretoCallThisConstructor(int id,String name,String school){
        this(id,name);
        this.school = school;
    }
    
    void display(){
        System.out.println("id "+id+" name "+name+" School "+school+"\n");
    }
    
    public static void main(String[] args) {
         WheretoCallThisConstructor obj1 =  new WheretoCallThisConstructor(1,"Amara","WUSL");
         WheretoCallThisConstructor obj2 =  new WheretoCallThisConstructor(1,"Nayana","RUSL");
         
         obj1.display();;
         obj2.display();
    }
}
