import java.util.Scanner;
class Q22B{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int row=s.nextInt();
        int va =65;
        for(int i =0;i<row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print((char)(va+j));
            }
                System.out.println();
        }
    }
}