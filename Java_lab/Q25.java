import java.util.Scanner;
class Q25{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        Double sum=0.0;
        System.out.println("Enter the numbers :");
        Double N=s.nextDouble();
        for(int i=0;i<N;i++){
            sum=sum+(1/(Math.pow(2,i)));
        }
        System.out.println("Enter the numbers :" + sum);
    }
}