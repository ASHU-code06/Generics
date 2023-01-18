package com.bridgelabzz;

public  class GenericsTest<T extends Comparable> {

    T max;

    public T maxnum(T a, T b, T c) {
        max = a;
        if (max.compareTo(b) < 0) {
            max = b;
        }
        if (max.compareTo(c) < 0) {
            max = c;
        }
        return max;
    }

}

