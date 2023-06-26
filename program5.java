import java.util.Scanner;
public class program5{
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    System.out.println("Enter the message to encrypt");
    String message =s.next();
    String echar = " ";
    String ochar =" ";

    for (int  i=0;i<message.length();i++){
      if (i%2==0){

        echar =echar +message.charAt(i);
        
      }
      else{
        ochar = ochar+message.charAt(i);
        
      }
    }
      String encryptedmessage=echar +ochar;
      System.out.println("Encrypted message is:" +encryptedmessage);
      s.close();
    }
    
  }
