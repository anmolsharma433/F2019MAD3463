package com.lambton;

public class LambtonStringTools {
    public String reverse(String s) {

        //reverse function

        char s1[] = s.toCharArray();
        String store;
        char reverse[] = new char[s.length()];
        int count = 0;
        for (int i = s1.length - 1; i >= 0; i--) {
            reverse[count++] = s1[i];

        }
        String finalrev = new String(reverse);
        return finalrev;
    }
    //binary to decimal function

    public int binarytodecimal(String s) {

        // System.out.println(Integer.parseInt(s,2));
        int value = Integer.parseInt(s);
        int decimal = 0;
        int i = 0;
        while (true) {
            if (value == 0)
            {
                break;
            }
            else
                {
                int temp = value % 10;
                decimal = (int) (decimal + temp * Math.pow(2, i));
                value = value / 10;
                i++;
            }

        }
        return decimal;
    }


    //Initials Functions
    public String initials(String s)
    {
        String[] splitter = s.split("\\s+");
        String ans ="";
        if(splitter.length == 3)
        {
            ans =splitter[0].substring(0,1).toUpperCase()+"."+splitter[1].substring(0,1).toUpperCase()+"."+splitter[2].substring(0,1).toUpperCase() + splitter[2].substring(1).toLowerCase();
        }
        else
        {
            System.out.println("null");
        }
        return ans;
    }

    


}

