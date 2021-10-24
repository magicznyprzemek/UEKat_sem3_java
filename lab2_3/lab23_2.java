package com.company;
import java.util.*;

//Zapisz własne wersje poniższych metod (wszystkie obowiązkowo).
//int compareTo(String anotherString) - porównanie dwóch łańcuchów
//: 0 równe. wart. ujemna - string mniejszy od zadanego, np. aaa i aab
//wart. dodatnia - string większy od zadanego;
//boolean endsWith (String suffix) - podajemy łańcuch i sprawdzenie,
//czy kończy się na wybrany podłańcuch/literę;
//int indexOf(String str) - udostępnia miejsce wystąpienia
//podłańcucha str w łańcuchu;
//String replace (char oldChar, char newChar);
//String substring (int beginindex) - udostępnia podciąg danego
//łańcucha od wybranego indeksu do końca.

public class Main
{
    //

    //  compareTo ---
    static public int compareTo(String x, String y)
    {
        int ValueX, ValueY;
        ValueX=CountLoop(x);
        ValueY=CountLoop(y);
        return (ValueX-ValueY);
    }
    static public int CountLoop(String x)
    {
        int value=0;
        for(int i=0; i<x.length(); i++)
        {
            value+=(int)x.charAt(i);
        }
        return value;
    }
    // endsWith ----
    static public boolean endsWith(String x, String y)
    {
        boolean IsSame=true;
        int letter=0;
        if(x.length()<y.length())
        {
            return false;
        }
        for(int i=(x.length()-y.length()); i<x.length(); i++)
        {
            if(x.charAt(i)!=y.charAt(letter))
            {
                IsSame=false;
            }
            letter++;
        }
        return IsSame;
    }
    // indexOf ------------
    static public int indexOf(String Sentence, String y)
    {
        for(int i=0; i< Sentence.length(); i++)
        {
            if(Sentence.charAt(i)==y.charAt(0))
            {
                boolean IsSame=true;
              //  int letter=0;
                for(int j=0; j<y.length(); j++)
                {
                    if(Sentence.charAt(i+j)!=y.charAt(j))
                    {
                        IsSame=false;
                    }


                }
                if(IsSame=true)
                    return i;
            }
        }
        return -1;
    }
    // replace --------------
    static String replace(String Sentence, char x, char y)
    {
        String New_Sentence="";
        for(int i=0; i<Sentence.length(); i++)
        {
            if(Sentence.charAt(i)==x)
                New_Sentence+=y;
            else
                New_Sentence+=Sentence.charAt(i);

        }
        return New_Sentence;

    }
    // substring
    static String substring(String Senetence, int x)
    {
        String New_Sentence="";
        for (int i=x; i<Senetence.length(); i++) {
            New_Sentence += Senetence.charAt(i);
        }
        return New_Sentence;

    }



    public static void main(String[] args)
    {
        String x = "ala ma kota";
        String y = "kota";
        System.out.println(substring(x, 3));
    }
}
