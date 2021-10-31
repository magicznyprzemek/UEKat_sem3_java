package com.company;
import java.util.*;
//Napisz własną metodę Split, przyjmującą dwa parametry. Łańcuch
//znaków, który powinien zostać podzielony oraz tablicę znaków char.
//Każdy znak w tablicy powinien służyć jako separator dla łańcucha
//znaków będącego pierwszym parametrem.

public class Main {

    public static int Count (String line, char[] keys)
    {
        int count=1;
        for(int i=0; i<line.length(); i++)
        {
            for(int y=0; y<keys.length; y++)
            {
                if(line.charAt(i)== keys[y])
                    count++;
            }
        }
        System.out.println("rozmiar tablicy:"+count);
        return count;
    }
    public static String CutOut(String line, int start, int end)
    {
        String result="";
        for(int i=start; i<=end; i++)
            result+=line.charAt(i);

        return result;
    }

    public static String[] Split (String line, char[] keys)
    {
        String[] result =new String[Count(line, keys)];
        int counter=0;
        int position=0;
        for(int i=0; i<line.length(); i++)
        {
           // System.out.print(line.charAt(i));
            for(int y=0; y<keys.length; y++)
            {
                if(line.charAt(i)== keys[y])
                {
                    result[counter]=CutOut(line, position, i-1);
                 //   System.out.println(result[counter]);
                    counter++;
                    position=i+1;
                }
                else if(i==line.length()-1)
                {
                    result[counter]=CutOut(line, position, i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String x="lubie;placki,test";
        char[] y= {';', ','};
        String[] wynik=Split(x, y);
        System.out.println(wynik[1]);
        System.out.println(wynik[0]);
        System.out.println(wynik[2]);
    }
}
