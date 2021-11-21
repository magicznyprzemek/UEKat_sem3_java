package com.company;
import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args)
    {
        int n=10;
        double[] tab= new double[n];
        RandomInt(tab);
        double sum=0, min=10, max=-10, parz=0;
        for(int i=0; i< tab.length; i++)
        {
            System.out.println(tab[i]);
            sum+=tab[i];
            if(tab[i]<min)
                min=tab[i];
            if(tab[i]>max)
                max=tab[i];
            if(tab[i]%2==0 & tab[i]!=0)
                parz+=tab[i];

        }

        System.out.println("średnia: "+(double)(sum/n));
        System.out.println("min: "+min+" max: "+max);
        Arrays.sort(tab);
        System.out.println("mediana: "+tab[tab.length/2]);
        System.out.println("średnia dla parzystych niezerowych: "+parz/n);


    }
    public static void RandomInt(double[] Array)
    {
        Random rand=new Random();
        for(int i=0; i< Array.length; i++)
        {
            Array[i]=ThreadLocalRandom.current().nextInt(-5, 5 + 1);

        }
    }
}
