import java.util.*;
public class MultiCatch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        try{
            System.out.print("Enter the index to access(Starting from 0): ");
            int index=sc.nextInt();
            System.out.println("The element at index "+index+" is: "+arr[index]);
            System.out.print("Enter number to divide each array element by:");
            int divisor=sc.nextInt();
            for(int i=0; i<n; i++){
                System.out.println("Element "+(i+1)+" after division: "+arr[i]/divisor);
            }
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Error: Index is out of bounds.");
        }catch(ArithmeticException a){
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
