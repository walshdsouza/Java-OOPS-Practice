import java.util.*;
public class StudentNames{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while(true){
            System.out.print("Enter Student Names (or type 'exit' to finish): ");
            String name=sc.nextLine();

            if(name.equalsIgnoreCase("exit")){
                break;
            }
            else if(!name.trim().isEmpty()){
                names.add(name);


            }
            else{
                System.out.println("Invalid input. Please enter a valid name.");
            }
        }

        if(names.isEmpty()){
            System.out.println("No names were entered.");
        }
        else{
            System.out.println("Student Names:");
            for(String n:names){
                System.out.println(n);

            }
            System.out.println("Total number of students: " + names.size());
        }
        sc.close();

    }
}
