import java.util.Scanner;
class Q21{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of numbers needed");
        int N=s.nextInt();
        int c=0;
        while(c<N){
        System.out.println("Enter the lower limit for search");
        int x = s.nextInt();
        System.out.println("Enter the Upper limit for search");
        int y=s.nextInt();
        if(x>y){
            System.out.println("Invalid input");
            break;
        }
        int nums=1;
        for(int i =x;i<y;i++){
            if(i>1){
                boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j ==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                
            System.out.println(i);
            }
            }
            
            
        }
            c=c+1;
        }
        System.out.println();4
    }

}