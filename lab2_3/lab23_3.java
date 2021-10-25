package com.company;
import java.util.*;
import java.util.regex.Pattern;

//Dla podanego łańcucha zamień wszystkie litery wybrane przez
//użytkownika na inne (również podane przez użytkownika).
//Dla podanego łańcucha znaków a, b i c zamień wszystkie podwojone
//lub potrojone litery na pojedyncze.

public class Main {
    static public String ReplaceLetters(String Line)
    {
        String New_line;
        {
            Scanner input = new Scanner (System.in);
            System.out.print("litera do wymiany: ");
            char x=input.next().charAt(0);
            System.out.print("pożądana litera: ");
            char y=input.next().charAt(0);
            New_line=Line.replace(x,y);
        }
        return New_line;
    }
    static public String Duplicate_xD(String xd)
    {
        String result="";
        for(int i=0; i<xd.length(); i++)
        {
            if(!result.contains(String.valueOf(xd.charAt(i))))
            {
                result+= String.valueOf(xd.charAt(i));
            }
        }
        return result;
    }
    static public String Duplicate_v2(String xd)
    {
        String resoult="";
        char[] chars = xd.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return resoult;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
       // String Line = input.nextLine();
        String Line="ala ma kota";
        boolean ReplaceAgain=false;
        /*
        do{
            ReplaceAgain=false;
            Line = ReplaceLetters(Line);
            System.out.println(Line);
            System.out.print("wymienić literę ponownie? (true/false)");
            ReplaceAgain=input.nextBoolean();
        }
        while (ReplaceAgain==true);
        */
        String xdd="abac";
       // System.out.println(Duplicate_xD(xdd));
      //  System.out.println(xdd.replaceAll("(.)\\1{1,}", "$1"));




    }
}
