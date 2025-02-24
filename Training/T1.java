package utils;
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;
import java.nio.file.*;
import java.text.*;
class T1{ 
        public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0|| i==n||j==0||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");

                    }
                    System.out.println();
                }


            }

    }
}
