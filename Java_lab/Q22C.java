import java.util.Scanner;
class Q22C{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows needed");
        int row=s.nextInt();
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print();
            }
            System.out.println();
        }
    }
}