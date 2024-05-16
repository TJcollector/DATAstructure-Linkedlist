package org.example.Assignment1;

public class Diamond {
    public static void main(String[] args) {
        //int num=4;
        //printDiamond(num);

    }
    public static void printDiamond (int k){
        int count=0;
        for (int index=1;index< k+1;index++) {
            StringBuilder hashtag = new StringBuilder();
            for (int index1 = k-count; index1>0; index1--) {
                //if (hashtag.length()==k){
                //    break;
                //}
                hashtag.append("#");
            }
            count++;
            StringBuilder star = new StringBuilder();
            for (int index2 = 1; index2 <= 2 * index - 1; index2++) {
                if (star.length()==2*k-1){
                    break;
                }
                star.append("*");
            }
            System.out.print(hashtag);
            System.out.print(star);
            System.out.print(hashtag);
            System.out.println();
        }


        int end=2*k-1;
        end-=2;

        for (int index=1; index<k;index++) {
            StringBuilder hashtag1 = new StringBuilder();
            for (int index3=k+2;index3>count;index3--){
                if (hashtag1.length()==k){
                    break;
                }
                hashtag1.append("#");
            }
            count--;
            StringBuilder star = new StringBuilder();


            for (int index4=0;index4<end;index4++){
                star.append("*");
            }
            end-=2;
            System.out.print(hashtag1);
            System.out.print(star);
            System.out.print(hashtag1);
            System.out.println();
        }


    }


}
