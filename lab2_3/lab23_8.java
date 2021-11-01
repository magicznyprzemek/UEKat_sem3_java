package com.company;
//Napisz metodę sprawdzającą, czy łańcuch wejściowy jest palindromem.
public class Main {
    public static boolean IsPalindrom(String line)
    {
        String reverse="";
        for(int i=line.length()-1; i>=0; i--)
        {
            reverse+=line.charAt(i);
        }
        System.out.println(reverse);
        if(line.compareTo(reverse)==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Test - "+IsPalindrom("Test"));
        System.out.println("kajak - "+IsPalindrom("kajak"));


    }
}
