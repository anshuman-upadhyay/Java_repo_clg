import java.util.Scanner;
public class Q2{
    public static void main(String args[]){
        int num1;int num2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        num1=sc.nextInt();
        
        System.out.print("Enter Number 2: ");
        num2=sc.nextInt();

        System.out.println("Before Swapping : " +num1 + "," +num2);

        int temp =num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping : " +num1 + "," +num2);
    }
}