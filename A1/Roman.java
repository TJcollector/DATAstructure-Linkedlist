package org.example.Assignment1;

public class Roman {
    public static void main(String[] args) {
        //int roman= romanToInt("MCMLIV");
        //System.out.println(roman);

    }
    public static int romanToInt(String romanNum){
        int answer = 0;
        romanNum=romanNum.toUpperCase();
        for (int index=0; index<romanNum.length(); index++)
        {
            int first = valuesingRo(romanNum.charAt(index));
            if (romanNum.length() > index+1) {
                int checksecond = valuesingRo(romanNum.charAt(index+1));
                if (checksecond>first) {
                    answer-= first;
                }
                else if (checksecond<=first){
                    answer+= first;
                }
            }
            else {
                answer+= first;
            }
        }
        return answer;
    }
    public static int valuesingRo(char roman1)
    {
        if (roman1 == 'I')
            return 1;
        else if (roman1 == 'V')
            return 5;
        else if (roman1 == 'X')
            return 10;
        else if (roman1 == 'L')
            return 50;
        else if (roman1 == 'C')
            return 100;
        else if (roman1 == 'D')
            return 500;
        else if (roman1 == 'M')
            return 1000;
        return 0;
    }

}
