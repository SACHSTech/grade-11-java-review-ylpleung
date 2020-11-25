package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat; 

public class Review4{
  public static void main(String[] args) throws IOException{

    int intcount;
    int intcount2;
    double dblprice;
    double dbltax;
    double dbltotal;
    double dblpayment;
    String pattern;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    intcount2 = 1;
    dblprice = 0;
    dbltax = 0;
    dbltotal = 0;
    dblpayment = 0;

    System.out.println("How many items will you buy?");
    intcount = Integer.parseInt(keyboard.readLine());

    pattern = "######.00";
    DecimalFormat df=new DecimalFormat(pattern);

    for (intcount2 = 1; intcount2<=intcount;intcount2++){
      System.out.println("Enter price of item" + intcount2);
      dblprice = Double.parseDouble(keyboard.readLine());
      dbltotal = dbltotal +dblprice;
    }
    
    System.out.println ("Subtotal = " +df.format(dbltotal));

    dbltax = dbltotal*13/100;
    System.out.println("Tax = " +df.format(dbltax));

    dblpayment = dbltax + dbltotal;
    System.out.println("Total = " +df.format(dblpayment));
  }
}