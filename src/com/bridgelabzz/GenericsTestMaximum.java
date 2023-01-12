package com.bridgelabzz;

import java.util.Scanner;

public class GenericsTestMaximum {
    float max;
    public float maxnum(float a, float b, float c){
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
        float num1 = userinput.nextFloat();
        System.out.println("Enter a number");
        float num2 = userinput.nextFloat();
        System.out.println("Enter a number");
        float num3 = userinput.nextFloat();
        float result =greatestNumberCase1.maxnum(num1,num2,num3);
        System.out.println("The greates number is "+result);
    }
}
