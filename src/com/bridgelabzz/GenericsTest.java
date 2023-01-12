package com.bridgelabzz;

import java.util.Scanner;

public  class GenericsTest<T> {
    public static  <T extends Comparable<T>> T checkMax(T X, T Y, T Z) {
       T  max = X;
        if(Y.compareTo(max) > 0){
            max = Y;
        }
        if(Z.compareTo(max) > 0) {
            max = Z;
        }
        return max;
    }

    public static void main(String[] args){
        GenericsTest genericsTestMaximum=new GenericsTest();
        genericsTestMaximum.greatestString();
        genericsTestMaximum.greatestFloat();
        genericsTestMaximum.greatestInteger();

    }
    public void greatestString(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a String");
        String num1 = userinput.nextLine();
        System.out.println("Enter a String");
        String num2 = userinput.nextLine();
        System.out.println("Enter a String");
        String num3 = userinput.nextLine();
        String result =checkMax(num1,num2,num3);
        System.out.println("The greatest String is "+result);

    }
    public void greatestInteger(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter an Integer");
        Integer num1 = userinput.nextInt();
        System.out.println("Enter an Integer");
        Integer num2 = userinput.nextInt();
        System.out.println("Enter an Integer");
        Integer num3 = userinput.nextInt();
        Integer result =checkMax(num1,num2,num3);
        System.out.println("The greatest Integer is "+result);

    }
    public void greatestFloat(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a float");
        Float num1 = userinput.nextFloat();
        System.out.println("Enter a float");
        Float num2 = userinput.nextFloat();
        System.out.println("Enter a float");
        Float num3 = userinput.nextFloat();
        Float result =checkMax(num1,num2,num3);
        System.out.println("The greatest float is "+result);

    }
}
