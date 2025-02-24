import java.util.Scanner;
class Q33{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int a[]={123,234,5432,2345};
        System.out.println("Enter the element to be searched");
        int target=s.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("the element is at index:"+i);
            }
        }

    }
}