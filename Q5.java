import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number 1 :");
        double num1=sc.nextDouble();
        System.out.println("Enter number 2 :");
        double num2=sc.nextDouble();
        double add=num1+num2;
        double sub=num1-num2;
        double multi=num1*num2;
        double div;
        if(num2!=0){
            div=num1/num2;
        }
        else{
            System.out.println("Division by 0 is not allowed");
            div=Double.NaN;
        }
        System.out.println("Add : " + add);
        System.out.println("Sub : " + sub);
        System.out.println("Multi : " + multi);
        System.out.println("Divide : " + div);

    }
}