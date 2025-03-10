import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
class lab{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the name,number,year you want to create for ");
        String name=s.nextLine();
        int number=s.nextInt();
        int year=s.nextInt();
        //Stores the data aka our hash in the hashed
        // stringBuilder allows us to make a create a mutable string 
        StringBuilder hashed= new StringBuilder();
        for(int i=0;i<name.length()-1;i++){
            if(i<=3){
                hashed.append(name.charAt(i));
            }
            else{
                break;
            }
        }
        int num=number;
        Integer arr[] =new Integer[10];
        int j=0;
        //stores the values in the number into an array
        while(num>0){
            //gives remainder
            int p=num%10;
            arr[j]=p;
            j++;
            num=num/10;
        }
        //sort the array : ab array ka last 3 smallest element array ka end me aa jayega
        //this avoids the need to further sort them back into descending order
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0;i<arr.length;i++){
            if(i>=arr.length-3){
                hashed.append((String) String.valueOf(arr[i]));
            }
        }
        //now adding the first even number of the year at the last
        int y=year;
        int even[]=new int[4];
        int k=0;
        while(y>0){
            int p=y%10;
            if(p%2==0){
                even[k]=p;
            }
            k++;
            y=y/10;
        }
        hashed.append((String) String.valueOf(even[even.length-1]));
        System.out.println(hashed);
    }
}