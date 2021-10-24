//U¿ytkownik podaje n ³añcuchów. Nale¿y zapamiêtaæ ³añcuch
//najd³u¿szy. Podaæ, ile ma znaków i go wypisaæ.
//Policzyæ wyst¹pienia litery podanej przez u¿ytkownika w //³añcuchu
//(podanym przez u¿ytkownika).

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
            System.out.print("liczba znakÃ³w: "+i+" - "+linia+"\n");
            if(i>max)
            {
              max=i;
              max_linia=linia;
            }
            
        }
      System.out.println("zakoÅ„czono, najdÅ‚uÅ¼szy Å‚aÅ„cuch: "+ max_linia);
      System.out.println("liczba znakÃ³w: "+max);
      System.out.print("liczona litera: ");
      char x = input.next().charAt(0);
      System.out.print("wystÄ™powanie litery "+x+": ");
      System.out.print(licz(max_linia, x));
      

    }
    
}