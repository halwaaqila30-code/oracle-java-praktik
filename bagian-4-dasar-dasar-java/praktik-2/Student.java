public class Student {
    public String fName;
    public String lName;
    public int stuId;
    public String stuStatus;

    public void displayStudentInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}