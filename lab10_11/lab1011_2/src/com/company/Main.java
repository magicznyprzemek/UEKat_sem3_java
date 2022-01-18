package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> lista=new ArrayList<>();
        try {
            czyt(lista);
            zapsiz(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void zapsiz(List<Integer> lista) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("plik.txt"));
        for(Integer i: lista)
        {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.close();
    }
    public static void czyt(List<Integer> lista) throws Exception
    {

        BufferedReader br = new BufferedReader(new FileReader("plik.txt"));
        String line;
        int i=0;
        while((line=br.readLine())!=null)
        {
            lista.add(Integer.parseInt(line)+1);
            System.out.println(lista.get(i));
            i++;
        }
        br.close();
    }
}
