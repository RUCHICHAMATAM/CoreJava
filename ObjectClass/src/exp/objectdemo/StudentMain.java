package exp.objectdemo;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student();
       // boolean isobject1=Object.create(String);
        boolean isobject=student instanceof Object;
        System.out.println("is object="+isobject);
    }
}
