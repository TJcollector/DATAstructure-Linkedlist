package org.example.Assignment1;

public class Hidden {
    public static void main(String[] args) {
        //boolean ans=isHidden("VhHTdipc07","hTc");
        //System.out.println(ans);
        //These test cases are from "Grave" in discord
//            boolean one = isHidden("afciturfdascxz", "cat");
//            boolean two = isHidden("welcometothehotelcalifornia", "space");
//            boolean three = isHidden("TQ89MnQU3IC7t6", "MUIC");
//            boolean four = isHidden("VhHTdipc07", "htc");
//            boolean five = isHidden("VhHTdipc07","hTc");
//            boolean six = isHidden("a1b2c3d4e5f6", "12345");
//            boolean seven = isHidden("AbCDeFGhIJkLMnOPQRstuVWXYZ", "abcdefghijklmnopqrstuvwxyz");
//            boolean eight = isHidden("abcd", "abcde");
//            boolean nine = isHidden("apple", "app");
//            boolean ten = isHidden("racecar", "racecar");
//
//            System.out.println("Test 1: isHidden(\"afciturfdascxz\", \"cat\") == " + one); //false
//            System.out.println("Test 2: isHidden(\"welcometothehotelcalifornia\", \"space\") == " + two); //false
//            System.out.println("Test 3: isHidden(\"TQ89MnQU3IC7t6\", \"MUIC\") == " + three); //true
//            System.out.println("Test 4: isHidden(\"VhHTdipc07\", \"htc\") == " + four); //false
//            System.out.println("Test 5: isHidden(\"VhHTdipc07\", \"hTc\") == " + five); //true
//            System.out.println("Test 6: isHidden(\"a1b2c3d4e5f6\", \"12345\") == " + six); //true
//            System.out.println("Test 7: isHidden(\"AbCDeFGhIJkLMnOPQRstuVWXYZ\", \"abcdefghijklmnopqrstuvwxyz\") == " + seven); //false
//            System.out.println("Test 8: isHidden(\"abcd\", \"abcde\") == " + eight); //false
//            System.out.println("Test 9: isHidden(\"apple\", \"app\") == " + nine); //true
//            System.out.println("Test 10: isHidden(\"racecar\", \"racecar\") == " + ten); //true

        }
    public static boolean isHidden(String s, String t){
        StringBuilder keep= new StringBuilder();
        char[] tt = t.toCharArray();
        char[] ss = s.toCharArray();
        int index=0;
        while (index<ss.length){
            if (ss[index]==tt[0]){
                break;
            }
            index++;
        }
        for (int ind=0;ind<tt.length;ind++) {
            for (; index < ss.length; index++) {
                char first = tt[ind];
                char second = ss[index];
                if (first==(second)){
                    keep.append(first);
                    break;
                }

                }
            }
        String keepit = keep.toString();
        //System.out.println(keepit);
        return keepit.equals(t);
        }
    }
