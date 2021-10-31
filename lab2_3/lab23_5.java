package com.company;
import java.util.*;


//Szyfrowanie tekstu - szyfr Cezara o zadaną przez użytkownika wartość.

public class Main {


    public static String SzyfrCezara (String x, int v)
    {
        String cezar="";
        for(int i=0; i<x.length(); i++)
        {
            if((int)x.charAt(i)>=65 && (int)x.charAt(i)<=90)
            {
                if((int)x.charAt(i)+v>90)
                    cezar+=moveChar((int)x.charAt(i), (v-26));
                else
                    cezar+=moveChar( (int)x.charAt(i), v);
            }
            else if((int)x.charAt(i)>=97 && (int)x.charAt(i)<=122)
            {
                if((int)x.charAt(i)+v>=122)
                    cezar += moveChar( (int)x.charAt(i), (v-26) );
                else
                    cezar += moveChar( (int)x.charAt(i), v);
            }
            else
                cezar+=x.charAt(i);
        }
        return cezar;
    }
    public static char moveChar(int x, int value)
    {
        return (char)(x+value);
    }

    public static void main(String[] args)
    {
        System.out.println(SzyfrCezara("Ala, ma koty 2", 3));
    }
}