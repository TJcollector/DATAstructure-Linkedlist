package org.example.Assignment1;

import java.math.BigInteger;

public class Fib {
    public static void main(String[] args) {
        //int n=firstNDigit(2);
        //System.out.println(n);
    }
//    public static int firstNDigit(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 0) {
//            return 0;
//        }
//        int counter = 0;
//        long num = (long) Math.pow(10, n - 1);
//        long n0,n2;
//        n0=0;
//        n2=1;
//        long numth = 0;
//        while (counter<num){
//            numth=n0+n2;
//            n0=n2;
//            n2=numth;
//            counter++;
//            if (numth>num){
//                counter++;
//                break;
//            }
//        }
//        //System.out.println(numth);
//        return counter;
//    }
public static int firstNDigit(int n) {
        if(n==1){
            return 1;
        }
        int c;
        BigInteger f1,f2,t,range;
        f1 = new BigInteger("1");
        f2 = new BigInteger("1");
        range = BigInteger.TEN.pow(n - 1);
    for (c = 2; f2.compareTo(range) < 0; c++) {
        t = f2;
        f2 = f2.add(f1);
        f1 = t;
    }
    return c;
    //was consiidering doing recursively,
    //but it wont be a good idea since the number of recursive maybe too large?
}
}
