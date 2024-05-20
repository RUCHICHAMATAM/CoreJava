 class StudentMain {
    public static void main(String[] args){
        Student student=new Student();
        student.id=1;
        student.name="Ruchitha";
        student.age=21;
        student.marks=944;
        student.addToAge(3);
        student.incrementAge();
        System.out.println("id"+" "+student.id+" "+"name"+" "+student.name+" "+"age"+" "+student.age+" "+"marks"+" "+student.marks);
    }
}
