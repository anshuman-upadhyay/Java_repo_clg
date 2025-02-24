import java.util.Scanner;
class printZero{
    public int n;
    public printZero(n){
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0|| i==n||j==0||j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");

                    }
                }
                    System.out.println();
            }
    }
}
class T1{
    public static void main(String arg[]){
         Scanner s=new Scanner(System.in);
            int n=s.nextInt();
        
            
    }
}
