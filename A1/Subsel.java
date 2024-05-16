package org.example.Assignment1;

import java.util.Arrays;

public class Subsel {
    public static void main(String[] args) {
        //int[] a=takeEvery(new int[]{1,2,3,4},2);
        //System.out.println(Arrays.toString(a));
        //These test cases are from "Uroll" in discord
//        int[] num = {1, 2, 3, 4};
//        int[] num2 = {2, 7, 1, 8, 4, 5};
//        int[] num3 = {3, 1, 4, 5, 9, 2, 6, 5};
//        int[] num4 = {0, 2, 100, 52, -12};
//        System.out.println(Arrays.toString(Subsel.takeEvery(num, 2))); // [1, 3]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num2, 3, 2))); // [1, 5]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num3, -1, 5))); // [2, 9, 5, 4, 1, 3]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num2, -1, num2.length - 1))); // reverse of num2
//        System.out.println(Arrays.toString(Subsel.takeEvery(num, 3))); // [1, 4]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num4, 2, 3))); // [52]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num4, 2, 2))); // [100, -12]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num4, -2, 4))); // [-12, 100, 0]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num4, 4))); // [0, -12]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num3, 4))); // [3, 9]
//        System.out.println(Arrays.toString(Subsel.takeEvery(num4, 1, 4))); // [-12]
    }
    public static int[] takeEvery(int[] a, int stride, int beginWith){
        if (stride<0 && beginWith==0){
            return new int[] {a[0]};
        } else if (a==null) {
            return new int[] {};
        }
        int [] end = new int[a.length];
        int s = stride;
        int b = beginWith;
        end[0]=a[b];
        int index=1;
        while(b+s>=0 && b+s<a.length){
            //System.out.println(beginWith+s);
            end[index]=a[beginWith+s];
            s+=stride;
            index++;

        }
        int [] finall=new int[index];
        //for (int elementss=0;elementss<index;elementss++){
        //    finall[elementss]=end[elementss];
        //}
        System.arraycopy(end,0,finall,0,index);
        return finall;
    }
    public static int[] takeEvery(int[] a, int stride){
        return takeEvery(a,stride,0);
    }

}
