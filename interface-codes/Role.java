import java.util.*;
interface Employee{
    void displayRole();

}
class Manager implements Employee{
    public void displayRole(){
        System.out.println("I am a Manager.");
    }
}
class Developer implements Employee{
    public void displayRole(){
        System.out.println("I am a Developer.");
    }
}
public class Role{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the role (Manager(1)/Developer(2)): ");
        int choice=sc.nextInt();
        Employee emp;
        if(choice==1){
            emp =new Manager();
            emp.displayRole();

        }
        else if(choice==2){
            emp =new Developer();
            emp.displayRole();
        }
        else{
            System.out.println("Invalid choice.");
        }
        sc.close();

    }
    
}
