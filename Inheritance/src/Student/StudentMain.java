package Student;

public class StudentMain {
    public static void main(String[] args){
       CseStudent  csestudent1=new CseStudent(1,"ruchitha","javafull stack");
       CseStudent csestudent2=new CseStudent(2,"rajitha","java");
        EceStudent ecestudent1=new EceStudent(1,"niki","oscillator");
        String language=csestudent1.getLanguage();
       Student csestudent3  = new CseStudent(3, "ruchitha", "javafull stack");
        Student csestudent4=new CseStudent(4,"rajitha","java");
        Student ecestudent2=new EceStudent(2,"niki","oscillator");
//String language1=csestudent3.getlanguage();
    }
}
