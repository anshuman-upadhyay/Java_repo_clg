// todo : . Write a java program to print "N" prime numbers within the range of X (lower limit) and Y (upper limit). Prompt the values of X, Y, and N from the user. Ensure that the value Y is greater than X and all the numbers are positive whole numbers. For any invalid input, ask for the input again.

import java.util.Scanner;
class Q21{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int x,y,N;
        while(true){
        System.out.print("Enter the first element: ");
        x=s.nextInt();
        System.out.print("Enter the second element: ");
        y=s.nextInt();
        System.out.print("Enter the number of primes needed ");
        N=s.nextInt();
        int c =0;
        if(x>y){
            System.out.println("X>Y not allowed reinput and retry");
            continue;
        }
        else{
            while(c<N){
                for(int i=2;i<y;i++){
                    if(isPrime(i) && i>x){
 System.out.println("the prime in range is : " + i);
                    }
                    
                }           
                c=c+1;
                }
                }
            }
           
        
    }
}
