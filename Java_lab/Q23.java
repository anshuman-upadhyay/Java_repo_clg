
import java.util.Scanner;

class Q23{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        float ai,pi,ir;
        int nd;
        float finalamt;
        System.out.print("Enter the Principle Amount");
        pi=s.nextFloat();
        System.out.print("Enter the Annual interest Rate");
        ir=s.nextFloat();
        ir=ir/100;
        System.out.print("Enter the Number of Days ");
        nd=s.nextInt();
        
        ai=pi*(ir/365)*nd;
        System.out.println("The accured interest is : "+ai);
        finalamt=pi+ai;
        System.out.println("The Final amount is : "+finalamt);


    }
}