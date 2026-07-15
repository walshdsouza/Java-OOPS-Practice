import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int rev=0;
        int temp=num;

        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        if(num==rev){
            System.out.print(num+" is a palindrome number.");
        }
        else{
            System.out.print(num+" is not a palindrome number.");
        }
        sc.close();

    }
}