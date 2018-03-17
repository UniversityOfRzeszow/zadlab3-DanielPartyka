/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import java.util.*;

public class Main {

    public static int silniar (int n)
    {
        if (n==1) return 1;
        else return n * silniar(n-1);
    }
    public static int silniai(int n)
    {
         int silnia=1;
         {
             for (int i=1;i<=n;i++)
             {
                 silnia = silnia * i;
             }
         }
        return silnia;
        
    }
    public static int fibor(int fib)
    {
        if (fib == 1) return 1;
        if (fib == 2) return 1;
        else return fibor(fib-2)+fibor(fib-1);
     }
   
    public static void main(String[] args) 
    {
        int wybor=0;
        while (wybor!=9) {
            System.out.println("Witaj w programie, wprowadz liczbe aby wyswietlic zadanie (1=1.4,2=1.7,3=2.2,4=3.3,5=3.4), aby zakonczyc program nacisnij 9");
            Scanner pobierz = new Scanner(System.in);
            wybor = pobierz.nextInt();
            switch(wybor)
            {
                case 1: 
                {
                    int a,b,c;
                    a = 5 >> 3;
                    b = 5 << 3;
                    c = 5 >>> 3;
                    System.out.println("Wynik >> to: "+a + " Wynik << to: "+b + " Wynik >>> to: "+c);
                    break;
                // Operatory (>>,<<,>>>) sluza do operacji na bitach, przesuniecie o 3 bity w prawo, 3 bitwy w lewo i przesuniecie w prawo bez znaku
                }
                case 2: 
                {
                    // W javie operator NOT(!) i XOR (^)
                 System.out.println((5==5)^(5==6)); // Alternatywa rozlaczna
                 System.out.println(!(5==5));       // Negacja
                 break;
                } 
                case 3: // Korzystalem ze stron https://www.javatpoint.com oraz https://www.tutorialspoint.com
                {
                    System.out.println("Ponizej char[] toCharArray():");
                    String s ="WitamWszystkich";  
                    char[] ch=s.toCharArray();      // char[] toCharArray() konwertuje string na tablice znakow char
                    for(int i=0;i<ch.length;i++){  
                    System.out.println(ch[i]);  
                }
                    System.out.println("Ponizej byte[] getBytes():");
                    String s1="ABCDEFG";  
                    byte[] barr=s1.getBytes();  
                    for(int i=0;i<barr.length;i++){  // 
                    System.out.println(barr[i]);  
                }  
                    System.out.println("Ponizej boolean equals():");
                    String p1="Daniel";  
                    String p2="Daniel";  
                    String p3=new String("Daniel");  
                    String p4="Daniel";  
                    System.out.println(p1.equals(p2)); 
                    System.out.println(p1.equals(p3));  
                    System.out.println(p1.equals(p4));  
                    System.out.println("Ponizej boolean equalsIgnoreCase():");
                    String p5="javatpoint";  
                    String p6="javatpoint";  
                    String p7="JAVATPOINT";  
                    String p8="python";  
                    System.out.println(p5.equalsIgnoreCase(p6));
                    System.out.println(p5.equalsIgnoreCase(p7));     
                    System.out.println(p5.equalsIgnoreCase(p8));
                    System.out.println("Ponizej boolean int campareTo():");
                    String a="hello";  
                    String a1="hello";  
                    String a2="meklo";  
                    String a3="hemlo";  
                    String a4="flag";  
                    System.out.println(a.compareTo(a1)); 
                    System.out.println(a.compareTo(a2));  
                    System.out.println(a.compareTo(a3));//-1 poniewaz "l" is  lower niz "m"  
                    System.out.println(a.compareTo(a4));//2 poniewaz "h" is dwa razy wieksze niz "f" 
                    System.out.println("Ponizej int indexOf():");
                    String Str = new String("Welcome to Tutorialspoint.com");
                    System.out.print("Found Index :" );
                    System.out.println(Str.indexOf( 'o' ));
                    String Str1 = new String("Welcome to Tutorialspoint.com");
                    String SubStr1 = new String("Tutorials" );
                    System.out.print("Found Index :" );
                    System.out.println( Str1.indexOf( SubStr1, 15 ));
                    String Str2 = new String("Welcome to Tutorialspoint.com");
                    System.out.print("Found Last Index :" );
                    System.out.println(Str2.lastIndexOf( 'o', 5 ));
                    System.out.println("Ponizej String substring:");
                    StringBuilder str = new StringBuilder("admin");
                    System.out.println("string = " + str);
                    System.out.println("substring is = " + str.substring(3));
                    System.out.println("substring is = " + str.substring(1, 4));
                    System.out.println("Ponizej String replace:");
                    String Str3 = new String("Welcome to Tutorialspoint.com");
                    System.out.print("Return Value :" );
                    System.out.println(Str.replace('o', 'T'));
                    System.out.print("Return Value :" );
                    System.out.println(Str.replace('l', 'D'));
                    System.out.println("Ponizej String trim:");
                    String ab="  hello string   ";  
                    System.out.println(ab+"javatpoint"); // bez trim()
                    System.out.println(ab.trim()+"javatpoint");//z trim()  
                    System.out.println("Ponizej String[] split:");
                    String x="java string split method by javatpoint";  
                    String[] words=x.split("\\s"); 
                    for(String w:words){  
                    System.out.println(w);
                    }  
                    /* String toLowerCase()
String toUpperCase() nie wstawialem bo to jest mi dobrze znane z c++ */
                    break;
                }    
                    case 4:
                {
                    int n;
                    System.out.println("Podaj liczbe naturalna a zwroce ci silnie:");
                    n = pobierz.nextInt();
                    System.out.println("Silnia obliczona rekurencyjnie "+silniar(n));
                    System.out.println("Silnia obliczona iteracyjnie "+silniai(n));
                    break;
                }
                case 5:
                {
                    int fib;
                    System.out.println("Podaj element ciagu Fibonacciego:");
                    fib = pobierz.nextInt();
                    System.out.println("Ciag Fibonacciego wynosi "+fibor(fib));
                    break;       
                    
                }
                
        
            }
   } 
  }
}