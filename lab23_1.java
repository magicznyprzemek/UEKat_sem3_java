
//package gradleproject1;
import java.util.*;

public class Main {

    public static int licz (String l, char x)  {
      int wyst=0;
      for(int i=0; i<l.length(); i++)
      {
        if((l.charAt(i))==x)
        {
          wyst++;
        }
      }
      return wyst;

    }
  

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        String linia="test";
        String max_linia="error";
        int i=0;
        int max=0;
        while(linia.contains("end")!=true)
        {
           linia=input.next();
            i=linia.length();
            System.out.print("liczba znaków: "+i+" - "+linia+"\n");
            if(i>max)
            {
              max=i;
              max_linia=linia;
            }
            
        }
      System.out.println("zakończono, najdłuższy łańcuch: "+ max_linia);
      System.out.println("liczba znaków: "+max);
      System.out.print("liczona litera: ");
      char x = input.next().charAt(0);
      System.out.print("występowanie litery "+x+": ");
      System.out.print(licz(max_linia, x));
      

    }
    
}