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

    switch (intmonth) {
      case 1:
      intdaysinmonth = 0;
      break;
      case 2:
      intdaysinmonth = 31;
      break;
      case 3:
      intdaysinmonth = 59;
      break;
      case 4:
      intdaysinmonth = 90;
      break;
      case 5:
      intdaysinmonth = 120;
      break;
      case 6:
      intdaysinmonth = 151;
      break;
      case 7:
      intdaysinmonth = 181;
      break;
      case 8:
      intdaysinmonth = 212;
      break;
      case 9:
      intdaysinmonth = 243;
      break;
      case 10:
      intdaysinmonth = 273;
      break;
      case 11:
      intdaysinmonth = 304;
      break;
      case 12:
      intdaysinmonth = 334;
    }
    intnumberofdays = intdaysinmonth + intday;

    System.out.println("number of days: " +intnumberofdays); 
  }
}