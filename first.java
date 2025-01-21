import java.util.Scanner;
class first{
public static void main(String args[]){
int m; float s;String ss;

System.out.print("Enter the value");
Scanner obj=new Scanner(System.in);
m=obj.nextInt();
System.out.println(m);

System.out.print("Enter the float value");
s=obj.nextFloat();
System.out.println(s);

System.out.println("Enter the String value");
obj.nextLine();
ss=obj.nextLine();
System.out.println(ss);

System.out.println(m+s);
}}
