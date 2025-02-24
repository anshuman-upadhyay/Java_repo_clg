// buffer,execption aur input stream both are a part of java.io package 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOExecption;

// Scanner comes from the util or the utility operator
import java.util.Scanner;

public class sttream{
    public static void main (String args[]) throws IOExecption {
        //this is called the String based usage 
        {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readline();
        String name=br.readline();
        System.out.println(name);//prints name 
        //now
        // this is an incompatible type kyuki by default readline se String format me input aata hai 
        int age =br.readline();
        //to counter this convert this String into integer
        int age = Integer.pareseInteger(br.readline());
        System.out.println(age);
        char gender =(char)br.read();// char return the ascii for the character so we have to type cast
        }
        // to counter all these errors java came up with a token based approach

    }
 }
// throws IOExecption: just checks for IO execptions 
// but agar hum log ko nahi pata hai ki kis type ka execption aayega tho use : Execptions