import java.util.Scanner;
import java.util.ArrayList;
class Multipy{
    int multiply(int a,int b){
        System.out.println("For 2 values worth of input");
        return a*b;
    }
    int multiply(int a,int b,int c){
        System.out.println("For 3 values worth of input");
        return a*b*c;
    }
    int multiply(ArrayList<Integer> a){
        int result=1;
        System.out.println("For an input of more than 3 :");
        for(int i =0;i<a.size();i++){
            result *= a.get(i);
        }
        return result;
    }
}
class Q62{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> elements= new ArrayList<>();
        Multipy n=new Multipy();
        int result=1;
        System.out.println("To end the input line please press *");
        while(true){
            System.out.print("Enter the elements ");
            String e= s.next();
            if(e.equals("*")){
                System.out.println("End of input");
                break;
            }
            elements.add(Integer.parseInt(e));            
            }
        if(elements.size()==2){
            result=n.multiply(elements.get(0),elements.get(1));
        }
        else if(elements.size()==3){
            result=n.multiply(elements.get(0),elements.get(1),elements.get(2));
        }
        if(elements.size()>3){
            result=n.multiply(elements);
        }
        System.out.println(result);
    }

}







// WAP to create a method to create a method named 'multiply' and overload it such thatFor 2 inputs, multiply of 2 numbers are done
// For 3 inputs, multiply of 3 numbers are done
// For other numbers, multiply them 