package com.bridgelabzz;

import java.util.Scanner;

public class GenericsTestMaximum {
    String max;
    public String maxnum(String a, String b, String c){
        max=a;
        if (max.compareTo(b)<0){
            max=b;
        }if (max.compareTo(c)<0){
            max=c;
        }
        return  max;
    }
    public static void main(String[] args){
        GenericsTestMaximum greatestStringCase1=new GenericsTestMaximum();
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a String");
        String num1 = userinput.nextLine();
        System.out.println("Enter a String");
        String num2 = userinput.nextLine();
        System.out.println("Enter a String");
        String num3 = userinput.nextLine();
        String result =greatestStringCase1.maxnum(num1,num2,num3);
        System.out.println("The greatest String is "+result);
    }
}
