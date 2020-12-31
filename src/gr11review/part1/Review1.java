package gr11review.part1;
import java.io.*;

public class Review1 {
  public static void main (String[] args) throws IOException {

    int intmonth;
    int intday;
    int intdaysinmonth;
    int intnumberofdays;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    intdaysinmonth= 0;
    
    System.out.println("enter the month number");
    intmonth = Integer.parseInt(keyboard.readLine());
    
    System.out.println("enter the day");
    intday = Integer.parseInt(keyboard.readLine());

    if (intmonth == 1){
      intdaysinmonth = 0;
    }else if(intmonth == 2){
      intdaysinmonth = 31;
    }else if(intmonth == 3){
      intdaysinmonth = 59;
    }else if(intmonth == 4){
      intdaysinmonth = 90;
    }else if(intmonth == 5){
      intdaysinmonth = 120;
    }else if (intmonth == 6){
      intdaysinmonth = 151;
    }else if (intmonth == 7){
      intdaysinmonth = 181;
    }else if (intmonth == 8){
      intdaysinmonth = 212;
    }else if (intmonth == 9){
      intdaysinmonth = 243;
    }else if (intmonth == 10){
      intdaysinmonth = 273;
    }else if (intmonth == 11){
      intdaysinmonth = 304;
    }else if (intmonth == 12){
      intdaysinmonth = 334;
    }
    
    intnumberofdays = intdaysinmonth + intday;

    System.out.println("number of days: " +intnumberofdays); 
  }
}