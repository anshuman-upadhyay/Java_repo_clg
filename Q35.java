import java.util.Scanner;
class Q35{
    static int locate;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[]={10,20,30,40,50,60,70,105};
        int b[] =new int[a.length];
        
        System.out.println("Enter the element to start");
        int c=s.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==c){
                locate=i;
                break;
            }
            
        }
        for(int i=locate;i<a.length;i++){
            b[i]=a[i];
            System.out.print([i]);}
    }
}