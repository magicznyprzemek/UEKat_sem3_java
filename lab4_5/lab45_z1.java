package com.company;
import java.util.*;

//Napisz funkcję pozwalajacą generować tablicę (o losowej długości)
//zmiennych String (każda zmienna o dowolnej długości).

public class Main {

    public static void main(String[] args)
    {
        String[] Test=LosowaTab();

    }
    public static String[] LosowaTab()
    {
        String[] Array1;
        Random rand = new Random();
        Array1 = new String[rand.nextInt()];
        System.out.println(Array1.length);
        return Array1;
    }

}
