package org.example.Assignment1;

import java.util.Arrays;

public class Happy {
    public static void main(String[] args) {
        //long[] k=firstK(11);
        //System.out.println(Arrays.toString(k));
        //System.out.println(Arrays.toString(firstK(20000000)));
        //System.out.println(sumOfDigitsSquared(20000000));
        //System.out.println(sumOfDigitsSquared(7));
        //boolean n=ishappy(7);
        //System.out.println(n);
        //System.out.println(Arrays.toString(k));
        //System.out.println((double) (3 / 2));
    }
    public static long sumOfDigitsSquared(long n) {
        if (n == 1) {
            return 1;
        }
//        long sum = 0;
//        while (n > 0) {
//            long digit = n % 10;
//            sum += digit * digit;
//            n /= 10;
//        }
//        return sum;

        char[] snum = Long.toString(n).toCharArray();
        long total = 0;

        int[] intnum = new int[snum.length];

        int index = 0;
        while (index <= snum.length - 1) {
            intnum[index] = Integer.parseInt(String.valueOf(snum[index]));
            index++;
        }
        for (index = 0; index < intnum.length; index++) {
            total += Math.pow(intnum[index], 2);
        }
        return total;
    }

   public static boolean isHappy(long n){
        if (n==1){
            return true;
        }
        long answer = 0;
        long keep= n;
        while(answer!=1 || answer!=4){
            answer=sumOfDigitsSquared(keep);
            keep=answer;
            if (answer==1||answer==4){
                break;
            }
        }
        return answer==1;
   }
    public static long[] firstK(int k){
        long[] arr = new long[k];
        int count = 0;
        long num = 1;

        while (count < k) {
            if (isHappy(num)) {
                arr[count] = num; // Corrected the assignment
                count++;
            }
            num++;
        }
        return arr;
//        long[] arr = new long[k];
//        int count=0;
//        long num=1;
//        while (count<k){
//            if (isHappy(num)){
//                arr[count]= (int) num;
//                count++;
//            }
//            num++;
//        }
//        return arr;


    }
}
//    String charr= Long.toString(n);
//    long m=n;long tenthh=10;long finall = 0;
//        while(m!=0) {
//                long keeping = (m % tenthh);
//                m -= keeping;
//                finall += Math.pow(keeping, 2);
//                tenthh *= 2;
//                }
//                return finall;
//        String charr= Long.toString(n);
//        long m=n;long tenthh=10;long finall = 0;
//        while(m!=0){
//            long keeping= (m%tenthh);
//            m-=keeping;
//            finall+=Math.pow(keeping,2);
//            tenthh*=2;
//        }
//        return finall;
//        for(int index=2;index<charr.length();index++ ){
//            long keep=m%tenthh;
//

