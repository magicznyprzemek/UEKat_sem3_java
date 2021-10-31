package com.company;

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
