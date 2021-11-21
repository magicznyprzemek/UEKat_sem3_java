package com.company;

public class Main {

    public static void main(String[] args)
    {
        double[] tab=new double[100];
        tab[0]=1; tab[1]=1;
        for (int i=2; i< tab.length; i++)
        {
            tab[i]=Fib(tab, i);
            System.out.println(tab[i]);
        }


    }
    public static double Fib(double[] array, int i)
    {
        return (array[i-1]+array[i-2]);
    }
}
