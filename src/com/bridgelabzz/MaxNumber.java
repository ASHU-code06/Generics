package com.bridgelabzz;

public class MaxNumber {
    //Rafactor case 2
public static void main(String[] args){
    GenericsTest<Integer> genericsTestI=new GenericsTest<>();
    GenericsTest<Float> genericsTestF=new GenericsTest();
    GenericsTest<String> genericsTestS=new GenericsTest();
    int reI= genericsTestI.maxnum(12,89,6);
    System.out.println("Greatest  Integer  "+reI);
    float reF= genericsTestF.maxnum(1.2F, 0.9F, 45.6F);
    System.out.println("Greatest  Float  "+reF);
    String reS= genericsTestS.maxnum("I","Strong","Lady");
    System.out.println("Greatest  String  "+reS);
}
}
