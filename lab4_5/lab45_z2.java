package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        int[] test=new int[100];
        Random rand = new Random();
        int sum=0;
        for(int i=0; i< test.length; i++)
        {
            test[i]= (int)(Math.random()*(100)+1);
            //System.out.println(test[i]);
            sum+=test[i];

        }
        System.out.println("suma: "+sum);
    }


}
