package gr11review.part1;
import java.io.*;

public class Review2{
  public static void main(String[] args) throws IOException{

    int intjoke;
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("0 - print an joke about  hair");
    System.out.println("1 - print a joke about  feet");
    System.out.println("2 - print a joke about  clothes ");
    System.out.println("3 - print a joke about your teacher ");

    intjoke = Integer.parseInt(keyboard.readLine());

    if(intjoke>3){
      System.out.println("Invalid menu option");
    }else{
      switch (intjoke){
        case 0:
        System.out.println(" I don’t deny the fact that I have a knack for getting into hairy situations. However, how I pull through explains why I am a cut above the rest.");
        break;
        case 1:
        System.out.println("Don’t ask a podiatrist to convert numbers to metric, they only are used to working with feet.");
        break;
        case 2:
        System.out.println("My fashion sense is a joke in itself");
        break;
        case 3:
        System.out.println("When Mr Fabroa is impressed, does he go fab-whoa? (I'm sorry this is terrible)");
      }
    }
  }
}