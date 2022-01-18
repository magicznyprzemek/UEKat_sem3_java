package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        try {
            czyt(lista);
            // kropki -> przecinki
            zapisz(lista, "\\.", ",", "plik2.txt");// mimo polecenia zapisuje w osobnych plikach aby nie musieć przywracać pierwotnego za każdym uruchomieniem programu
            // kropki -> spacje
            zapisz(lista, "\\.", " ", "plik3.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void zapisz(List<String> lista, String x, String y, String nazwa) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nazwa));
        for (String i : lista) {
            bw.write(zamiana(i, x, y) + ";");
        }
        bw.close();
    }

    static String zamiana(String line, String x, String y) {
        String[] Split = line.split(x);
        return Split[0] + y + Split[1];
    }

    public static void czyt(List<String> lista) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("plik.txt"));
        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] splitLine = line.split(";");
            for (String x : splitLine) {
                System.out.println(x);
                lista.add(x);
            }
        }
        br.close();
    }
}