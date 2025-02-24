import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: " );
        char character= sc.next().charAt(0);
        int asciiVal = (int) character;
        System.out.println("ASCII value of ' " + character+"' = "+  asciiVal);
    }
}