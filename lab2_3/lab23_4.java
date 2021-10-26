package com.company;
import java.util.*;

//Napisz własne wersje poniższych metod:
//String toLowerCase() - zamiana na małe litery;
//String toUpperCase() - zamiana na duże litery;

public class Main {



    static public String ToLower (String x)
    {
        String result="";
        for(int i=0; i<x.length(); i++)
        {
            if((int)x.charAt(i)>=65 && (int)x.charAt(i)<=90)
            {
                int ascii=((int)x.charAt(i)+32);
                result+=(char)ascii;
            }
            else
            {
                result+=x.charAt(i);
            }
        }
        return result;
    }
    static public String ToUpper (String x)
    {
        String result="";
        for(int i=0; i<x.length(); i++)
        {
            if((int)x.charAt(i)>=97 && (int)x.charAt(i)<=122)
            {
                int ascii=((int)x.charAt(i)-32);
                result+=(char)ascii;
            }
            else
            {
                result+=x.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
	 System.out.println((ToUpper("aAa")));
    }
}
