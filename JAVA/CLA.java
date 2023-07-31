

import java.io.*;

import java.util.Scanner;

public class CLA {
        
        public static void main(String[] args) throws Exception
        {
                System.out.println("addition of two number using  three input methods");
                int x,y;
                BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter two numbers");
                x=Integer.parseInt(b.readLine());
                y=Integer.parseInt(b.readLine());
                System.out.println("sum is=" +(x+y));
                int a =Integer.parseInt(args[0]);
                int d =Integer.parseInt(args[1]);
                int sum1=0;
                sum1=a+d;
                System.out.println(sum1);      
        }
}
