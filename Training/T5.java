import java.util.Scanner;
import java.util.InputMismatchException;
class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=a+b;
            int d=a/b;
            System.out.println("Sum of two numbers is "+c);
            System.out.println("Division of two numbers is "+d);
        }
        catch(InputMismatchException e){
            System.out.println("Exception: invalid input");
        }
        catch(ArithmeticException e){
            System.out.println("Exception: division by zero");
        }
        
        sc.close();
    }
}