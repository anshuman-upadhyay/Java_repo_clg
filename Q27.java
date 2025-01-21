import java.util.Scanner;
class Q27{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int in;
        int sum=0;
        System.out.print("Enter the element :");
        in=s.nextInt();
        int input=in;
        while(in>0){
            int r=in%10;
            sum=sum+r;
            in=in/10;
        }
        if(input%sum==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}