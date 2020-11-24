package gr11review.part1;
import java.io.*;

public class Review8{
  public static void main(String[] args) throws IOException{

    int intcount;
    int intcount2;
    int intrandom1;
    int intrandom2;
    int intrandom3;
    int inthundreds;
    int inttens;
    int intunits;
    int intdivide;

    intcount= 0;
    intcount2= 0;
    inthundreds = 0;
    inttens =0;
    intunits = 0;
    intdivide = 0;

    while (intcount<1000){
      intrandom1 = (int)(Math.random() * 9); 
      System.out.println(intrandom1);
      inthundreds = intrandom1*100;
      intrandom2 = (int)(Math.random() * 9); 
      System.out.print(intrandom2);
      inttens = intrandom2*10;
      intrandom3 = (int)(Math.random() * 9);  
      System.out.print(intrandom3);
      intunits = intrandom3;
      
      intdivide = inthundreds + inttens + intunits;

      intcount++; 

      if(intdivide%111==0){
        intcount2++;
      }
      }
      System.out.println(intcount2);
    }
  }