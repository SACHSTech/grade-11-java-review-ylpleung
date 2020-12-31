package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat; 

public class Review6{
  public static void main(String[] args) throws IOException{

    int intcount;
    double dblprice;
    double dbltax;
    double dbltotal;
    double dblpayment;
    String pattern;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    intcount = 1;
    dblprice = 1;
    dbltax = 0;
    dbltotal = 0;
    dblpayment = 0;

    pattern = "######.00";
    DecimalFormat df=new DecimalFormat(pattern);

    while (dblprice>0){
      System.out.println("Enter price of item" + intcount);
      dblprice = Double.parseDouble(keyboard.readLine());
      dbltotal = dbltotal +dblprice;
      intcount++;
    }
    
    System.out.println ("Subtotal = " +df.format(dbltotal));

    dbltax = dbltotal*13/100;
    System.out.println("Tax = " +df.format(dbltax));

    dblpayment = dbltax + dbltotal;
    System.out.println("Total = " +df.format(dblpayment));
  }
}