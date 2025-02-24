import java.util.Scanner;
class Q26{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first element :");
        a=s.nextInt();
        System.out.println("Enter the second element :");
        b=s.nextInt();
        System.out.println("The numbers before swap are "+a +"and"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The numbers after swap are "+a +"and"+b);
    }
}