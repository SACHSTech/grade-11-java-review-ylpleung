package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat; 

public class Review5{
  public static void main(String[] args) throws IOException{

    double dblmoney;
    double dblyearly;
    double dblinterest;
    double dblrate;
    double dblgoal; 
    int intyears;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    dblmoney = 0;
    dblinterest = 0;
    intyears = 0;

    System.out.println("Enter yearly amount");
    dblyearly = Double.parseDouble(keyboard.readLine());

    System.out.println("Enter compound interest rate");
    dblrate = Double.parseDouble(keyboard.readLine());

    System.out.println("Enter target amount");
    dblgoal = Double.parseDouble(keyboard.readLine());

    while (dblmoney< dblgoal){
      dblmoney = dblmoney + dblyearly;
      dblinterest = dblmoney*dblrate/100;
      dblmoney = dblmoney + dblinterest;
      intyears++;
    }
    System.out.println("The target amount will be acheived in " +intyears +" years.");
  }
}