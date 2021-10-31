package com.company;

//Napisz metodę odwrotną do powyższej, która dla tablicy wejściowej
//zawierającej elementy String zwraca łańcuch znaków.

public class Main {
    public static String MergeStrings(String[] array, String inBetween)
    {
        String result="";
        for(int i=0; i<array.length; i++)
        {
            result+=array[i];
            result+=inBetween;
        }
        return result;
    }
    public static void main(String[] args)
    {
        String[] test = {"ala", "ma", "kota"};
        System.out.println(MergeStrings(test, " "));
    }
}
