package gr11review.part1;
import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{

    int intcount;
    int intcount2;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    intcount = 20;
    intcount2 = 28;

    for(intcount=20;intcount<=100;intcount++){
      if (intcount%2==1){
        System.out.print(intcount +" ");
      } 
    }

    System.out.println("     ");

    System.out.print("29 ");
    for(intcount2=28;intcount2>= 2;intcount2--){
      System.out.print(" " +intcount2 + " ");
    }
  }
}