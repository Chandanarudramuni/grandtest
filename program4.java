import java.util.Scanner;
public class program4{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a noun:");
    String noun =s.nextLine();

    System.out.println("Enter an adjective:");
    String adjective =s.nextLine();

    System.out.println("Enter the activity");
    String activity =s.nextLine();

    String story =noun +"was really" +adjective + "today We learned how to write" +activity +"today. I can't wait for tomorrow!";

    System.out.println(""+story);
  }
}