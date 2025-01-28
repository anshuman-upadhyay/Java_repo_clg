import java.util.Scanner;
class Q36{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of elements in arr1:");
        int size1=s.nextInt();
        System.out.println("Enter the no of elements in arr12");
        int size2=s.nextInt();
        int a[] =new int[size1];
        if(size1!=size2){
            System.out.println("The arrays are not equal");
        }
        else{
                    for(int i=0;i<size1;i++){
            System.out.print("Enter the element "+i+" for arr1");
            a[i]=s.nextInt();
            
        }
        for(int i=0;i<size2;i++){
            System.out.print("Enter the element "+i+" for arr2");
            b[i]=s.nextInt();
            
        }
        }
        for(int i=0;i<size1;i++){
            if(a[i]!=b[i]){
                System.out.println("the arrays ar not equal");
                break;
            }
        }
    }
}