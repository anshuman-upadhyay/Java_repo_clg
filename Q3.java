public class Q3{
    public static void main(String[] args){
        int num1=2,num2=4;
        System.out.println("Before Swapping : " +num1 + "," +num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping : " +num1 + "," +num2);
    }
    }

