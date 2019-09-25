package com.lambton;

public class LambtonStringTools
{
    public String reverse(String s)
    {

        char s1[] = s.toCharArray();
        String store;
        char reverse[] =new char[s.length()];
        int count = 0;
        for(int i = s1.length-1; i>=0;i--)
        {
            reverse[count++]=s1[i];

        }
        String finalrev= new String(reverse);
        return finalrev;
    }
}
