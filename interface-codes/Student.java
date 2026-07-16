import java.util.*;
interface Printable{
    void printDetails();
}
 class StudentClass implements Printable{
    String name;
    int rollNumber;
    StudentClass(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

}
public class Student{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter the roll number of the student: ");
        int rollNumber = sc.nextInt();
        Printable student = new StudentClass(name,rollNumber);
        student.printDetails();
        sc.close();
    }
}