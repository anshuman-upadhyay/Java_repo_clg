import java.util.Scanner;
class Q34{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int sum=0;
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the marks of  "+ i+"th  subject out of 100 :");
            int x=s.nextInt();
            if(x>100){
                System.out.println("The marks must be under 100");
                break;
            }
            else{
                a[i]=x;
            sum+=a[i];
            }

        }
        if(sum>400 && sum<=500){
            System.out.println("O");
        }
        
        if(sum>300 && sum<=400){
            System.out.println("E");
        
        }
        if(sum>250 && sum<=300){
            System.out.println("A");
        }
        
        if(sum>200 && sum<=250){
            System.out.println("B");
        }
        
        if( sum<=200){
            System.out.println("F");
        }

    }
}