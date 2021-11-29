package com.company;
import java.util.*;
import java.util.Random;

////Zadeklaruj tablicę 10x10, wypełnij ją jak tabliczkę mnożenia.
////Utwórz tablicę 10x5, wypełnij ją losowymi liczbami całkowitymi
////(0 : 20), a następnie sprawdź w którym wierszu jest największa suma
////(wypisz liczby na ekran, obok podaj sumę każdego wiersza).
////Tablicę 10x10 typu double wypełnij liczbami losowymi z przedziału
////h−0.5 : 0.5i – następnie w zależności od wyboru użytkownika,
////wyzeruj pola ujemne, lub dodatnie.
////Podaj średnią arytmetyczną tablicy kwadratowej i sumę elementów
////na przekątnej.
//

public class Main {

    public static void TabliczkaM (int[][] tab)
    {
        for(int i=1; i<= tab.length; i++)
        {
            for(int j=1; j<=tab[i-1].length; j++)
            {
                tab[i-1][j-1]=i*j;
            }
        }
    }
    public static void PrintArray(int[][] tab)
    {
        for(int i=0; i< tab.length; i++)
        {
            for(int j=0; j<tab[i].length; j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void ArrayRand(int[][] tab)
    {
        int max=0;
        Random rand = new Random();
        for(int i=0; i< tab.length; i++)
        {
            int sum=0;
            for(int j=0; j<tab[i].length; j++)
            {

                tab[i][j]=rand.nextInt(20);
                System.out.print(tab[i][j]+" ");
                sum+=tab[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
            System.out.print("- " +sum);
            System.out.println();
        }
        System.out.println("max: "+max);

    }
    public static void ArrayDouble(double[][] tab)
    {
        Random rand = new Random();
        for(int i=0; i< tab.length; i++)
        {
            int sum=0;
            for(int j=0; j<tab[i].length; j++)
            {
                tab[i][j]=-0.5+ (1)*rand.nextDouble();
                System.out.print(tab[i][j]+" ");

            }
            System.out.println();
        }

    }
    public static void Zerowanie(double[][] tab)
    {
        System.out.print("wyzerować wartości o znaku + lub - (plus/minus): ");
        Scanner scan= new Scanner(System.in);
        String znak=scan.next();
        System.out.println(znak);
        if(znak.equals("plus"))
        {
            for(int i=0; i< tab.length; i++)
            {
                int sum=0;
                for(int j=0; j<tab[i].length; j++)
                {
                    if(tab[i][j]>0) {tab[i][j]=0;}
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
        }
        else if (znak.equals("minus"))
        {
            for(int i=0; i< tab.length; i++)
            {
                int sum=0;
                for(int j=0; j<tab[i].length; j++)
                {
                    if(tab[i][j]<0) {tab[i][j]=0;}
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
        }


    }
    public static void ArrayKw(int[][] tab)
    {
        int sum=0;
        int sumPrzek=0;
        for(int i=0; i< tab.length; i++)
        {

            for(int j=0; j<tab[i].length; j++)
            {
                sum+=tab[i][j];

            }
            sumPrzek+=tab[i][i];
        }
        System.out.println("średnia: "+ (sum)/(tab.length*tab[1].length));
        System.out.println("Suma na przekątnej: "+ sumPrzek);

    }



    public static void main(String[] args)
    {
        // 1
        int[][] TabM=new int[10][10];
       //TabliczkaM(TabM);
       //PrintArray(TabM);

        // 2
        int[][] TabLos=new int[10][5];
       // ArrayRand(TabLos);

        //3
        double[][] TabDouble=new double[10][10];
       // ArrayDouble(TabDouble);
       // Zerowanie(TabDouble);

        //4
        int[][] TabKwadr=new int[5][5];
        TabliczkaM(TabKwadr);
        PrintArray(TabKwadr);
        ArrayKw(TabKwadr);


    }
}
