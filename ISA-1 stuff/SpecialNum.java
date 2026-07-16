import java.util.Scanner;
public class SpecialNum {
    static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;

        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int sum=0;
        int temp=num;

        while(temp>0){
            int digit=temp%10;
            sum+=factorial(digit);
            temp/=10;
        }

        if(sum==num){
            System.out.println(num+" is a special number.");
        }
        else{
            System.out.println(num+" is not a special number.");
        }
        sc.close();

    }
}   