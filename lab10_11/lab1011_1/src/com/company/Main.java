package com.company;
import java.io.*;
import java.io.BufferedReader;

class Film implements Serializable
{
  //  private static final long serialVersionUID = 6529685098267757690L; // ffffffffffff
    public String Tytul;
    public String Rezyser;
    int rokProdukcji;
    String[] aktorzy;
    public Film()
    {

    }
    public Film(Film f)
    {
        Tytul=f.Tytul;
        Rezyser=f.Rezyser;
        rokProdukcji=f.rokProdukcji;
        aktorzy=f.aktorzy;
    }
    public Film(String T, String R, int RP, String[] A)
    {
        Tytul=T;
        Rezyser=R;
        rokProdukcji=RP;
        aktorzy=A;
    }
    public void przedstawSie() {
        System.out.println(Tytul + " " + Rezyser + ", " + rokProdukcji);
        for (int i = 0; i < aktorzy.length; i++) {
            System.out.print(aktorzy[i] + " ");
        }
        System.out.println();
    }
}
class Ksiazka implements Serializable
{
   // private static final long serialVersionUID = 6529685098267757690L;
    String Tytul;
    String Autor;
    int rokWydania;
    int liczbaStron;
    String Gatunek;
    public Ksiazka()
    {

    }
    public Ksiazka(String T, String A, int RW, int LS, String G)
    {
        Tytul=T;
        Autor=A;
        rokWydania=RW;
        liczbaStron=LS;
        Gatunek=G;
    }
    public void przedstawSie() {
        System.out.print(Tytul + " " + Autor + ", " + rokWydania);
        System.out.println(" -- Liczba ston: "+liczbaStron);
        System.out.println();
    }

}

public class Main {

    public static void main(String[] args)
    {
        String[] akr={"AktA", "AktB", "AktC"};
        Film testowy=new Film("Alien", "Ridley Scott", 1979, akr);
        Film testowy2=new Film("dasdasda", "123", 2001, akr);
        Ksiazka testowaK= new Ksiazka("Super Książka","autor jakiś-tam", 2021, 37, "kryminal");
        //Zapis(testowy);
        Object[] tab= {testowy, testowy2, testowaK};
        Zapis2(tab);
        Czytaj("plik2");


    }

    //metoda przyjmująca obiekt klasy Film i zapisująca go do pliku o
    //rozszerzeniu obj. Metoda powinna zwracać 0, jeżeli operacja zapisu
    //powiodła się, lub -1, jeżeli nie udało się dokonać zapisu;
    public static int Zapis(Film obiekt)
    {
        int ret=0;
        ObjectOutputStream strumien = null;
        try
        {
         strumien=new ObjectOutputStream(new FileOutputStream("plik"));
         strumien.writeObject(obiekt);
        }
        catch(Exception e)
        {
            ret=-1;
            e.printStackTrace();
        }
        return ret;
    }
    //metoda przyjmująca tablicę obiektów klasy Object zapisywanych do
    //pliku. Tablica może zawierać elementy klasy Ksiazka oraz Film;
    public static int Zapis2(Object[] tab)
    {
        int ret=0;
        ObjectOutputStream strumien = null;
        try
        {
            strumien=new ObjectOutputStream(new FileOutputStream("plik2"));
            for(int i=0; i<tab.length;i++)
            {
                strumien.writeObject(tab[i]);
            }
        }
        catch(Exception e)
        {
            ret=-1;
            e.printStackTrace();
        }
        return ret;
    }
    public static void Czytaj(String NazwaPliku)
    {
        ObjectInputStream strumien = null;
        try
        {
            strumien=new ObjectInputStream(new FileInputStream(NazwaPliku));
            Object obj = null;
            Film test=null;
            while(true)
            {
                obj = strumien.readObject();
                if(obj instanceof Film)
                {
                    test=(Film)obj;
                    System.out.println(test.Rezyser+" - "+test.Tytul);
                }
                else if(obj instanceof Ksiazka)
                {
                    ((Ksiazka) obj).przedstawSie();
                }
            }
        }
        catch (EOFException ex)
        {
            System.out.println("EOF");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
