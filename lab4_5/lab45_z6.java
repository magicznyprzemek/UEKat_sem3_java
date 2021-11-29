package com.company;
import java.util.*;

//Stwórz nieregularną tablicę dwuwymiarową o dowolnym rozmiarze.
//Następnie stwórz tablicę jednowymiarową zawierającą tyle elementów, ile
//wierszy znajduje się w pierwszej tabicy. Parzyste komórki tablicy
//jednowymiarowej powinny zawierać odpowiadające konkretnym wierszom
//z tablicy dwuwymiarowej elementy maksymalne. Natomiast komórki
//nieparzyste – odpowiednio elementy minimalne.

public class Main {

    public static int MinMax(int[] tab, boolean x)
    {
        int value;
        if(x==true) {
            value = -20000000;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]>value)
                    value=tab[i];
            }
            return value;
        }
        else {
            value = 20000007;
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i]<value)
                    value=tab[i];
            }
            return value;
        }
    }

    public static void main(String[] args) {

        int[][] tab={
                {1, 2, 5, 0}, //max 5
                {3,3,3, -3},  //min -3
                {100,0, 1, 2}, //max 100
                {1,1,2,2,3,5}  //min 1
        };
        int[] tab2=new int[tab.length];
        for(int i=0; i<tab2.length; i++)
        {
            if(i%2==0)
            {
                tab2[i]=MinMax(tab[i], true);
            }
            else if(i%2!=0)
            {
                tab2[i]=MinMax(tab[i], false);
            }
            System.out.print(tab2[i]+" ");
        }

    }
}
