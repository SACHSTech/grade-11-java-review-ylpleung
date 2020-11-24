package gr11review.part1;
import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{

    int intcount;
    int intcount2;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    intcount = 20;
    intcount2 = 28;

    while (intcount<= 100){
      if (intcount%2==1){
        System.out.print(intcount +" ");
      } 
      intcount++;
    }

    System.out.println("     ");

    System.out.print("29 ");
    while (intcount2 >= 2){
      System.out.print(" " +intcount2 + " ");
      intcount2--;
    }
  }
}