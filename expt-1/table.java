import java.util.*;


public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the table: ");
        int num=sc.nextInt();
        System.out.print("Enter the range: ");
        int n=sc.nextInt();
        System.out.println("The table of "+num+" is: ");
        for(int i=1; i<=n;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
        sc.close();
    }    
        
}
