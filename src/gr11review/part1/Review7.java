package gr11review.part1;
import java.io.*;

public class Review7{
  public static void main(String[] args) throws IOException{

    int intcount1;
    int intcount2;
    int intcountcharacter;
    int intcounta;
    int intcountspace;
    int intlength;
    int intsub;
    String string;
    
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    intcountcharacter = 0;
    intcount1 = 0;
    intcount2 = 0;
    intcounta = 0;
    intcountspace = 0;
    intsub = 1;

    System.out.println("Enter your sentence");
    string = keyboard.readLine();

    intlength = string.length(); 

    for(intcount1 = 0; intcount1 < intlength; intcount1++) {    
      if(string.charAt(intcount1) != ' '){
        intcountcharacter++;  
      } else{
        intcountspace++;
      }
      if(string.charAt(intcount1) == 'a'){
        intcounta++;
      }       
    }
    System.out.println("Number of characters: " +intcountcharacter);
    System.out.println("Number of spaces: " +intcountspace);
    System.out.println("Number of a-s: " +intcounta);
    System.out.println("Taking the odd numbered characters in the sentence produces the following string: ");

    for(intcount2 = 0; intcount2<intlength;intcount2 = intcount2 +2){
      System.out.print(string.substring(intcount2,intsub));
      intsub = intsub + 2;
    }
  }
}