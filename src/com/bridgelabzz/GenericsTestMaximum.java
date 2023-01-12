package com.bridgelabzz;

import java.util.Scanner;

public class GenericsTestMaximum {
    int max;
    public int maxnum(int a, int b, int c){
        if (a>b&a>c){
           max=a;
        }
        if (b>a&b>c){
            max=b;
        }
        if (c>a&c>b){
            max=c;
        }
        return  max;
    }
    public static void main(String[] args){
        GenericsTestMaximum greatestNumberCase1=new GenericsTestMaximum();
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = userinput.nextInt();
        System.out.println("Enter a number");
        int num2 = userinput.nextInt();
        System.out.println("Enter a number");
        int num3 = userinput.nextInt();
        int result =greatestNumberCase1.maxnum(num1,num2,num3);
        System.out.println("The greates number is "+result);
    }
}
