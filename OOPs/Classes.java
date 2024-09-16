package OOPs;

public class Classes {
    public static void main(String[] args) {
//        student_01 a = new student_01();
//        a.name = "Karan";
//        a.id = 1;
//        a.age = 12;
//        a.nos = 5;


        Student_01 A = new Student_01(1,12,"Karan",5);

        // A.sleep();

        Student_01 b = new Student_01(A);
        b.sleep();

    }
}
