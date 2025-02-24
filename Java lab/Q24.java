
import java.util.Scanner;

class Q24{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int input;
        System.out.println("Enter an element : ");
        input=s.nextInt();
        int oddSum=0;
        int evenSum=0;
     
        while(input>0){
            int r=input%10;
            if(r%2==1){
                oddSum=oddSum+r;
            }
            if(r%2==0){
                evenSum=evenSum+r;
            }
            input=input/10;
            
        }
        System.out.println("Sum of odd digits are : "+oddSum);
        System.out.println("Sum of even digits are : "+evenSum);
    }
}