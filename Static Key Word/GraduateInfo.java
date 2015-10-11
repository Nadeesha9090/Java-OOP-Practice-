
//Java static keyword use in variables 
public class GraduateInfo {
    static int id = 0;
    String name;
    static String  universityName = "RUSL";
    
   
    GraduateInfo(String n){
        id++;
        name = n;
    }
    
    void displayGraduatesInfo(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        System.out.println("University Name "+ universityName+"\n\n");
    }
    
    public static void main(String[] args) {
        GraduateInfo student1 = new GraduateInfo("Amara");
        student1.displayGraduatesInfo();  
        GraduateInfo student2 = new GraduateInfo("Nayana");
        student2.displayGraduatesInfo(); 
        GraduateInfo student3 = new GraduateInfo("Kamal");
        student3.displayGraduatesInfo(); 
    }
}
