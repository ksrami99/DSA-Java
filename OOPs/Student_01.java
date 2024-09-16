package OOPs;

public class Student_01 {

    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Constructor
    Student_01(){}

    // parameterized constructor
    Student_01(int id, int age, String name, int nos){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // copy constructor

    Student_01(Student_01 srcObj){
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }

    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }

}
