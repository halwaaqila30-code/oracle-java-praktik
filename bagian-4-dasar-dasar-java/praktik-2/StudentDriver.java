public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.fName = "Lisa";
        student1.lName = "Palombo";
        student1.stuId = 123456789;
        student1.stuStatus = "Active";

        student1.displayStudentInfo();
    }
}