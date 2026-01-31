class Student{
    int id;
    String name;
    void display(){
    System.out.println(this.id);
    System.out.println(this.name);
    }
}

public class Oops {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.id=101;
        s1.name="Aman";
        s1.display();
}
}