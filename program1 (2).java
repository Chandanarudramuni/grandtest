import java.util.Scanner;
public class program1 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Entered amount should be positive and only integers:");
    int amount = s.nextInt();
    int rupees500 =0;
    int rupees200 =0;
    int rupees100=0;  

    if(amount%100!=0){
      System.out.println("Entered amount should be multiple of 100");
      
    }
    while(amount >500){
      rupees500++;
      amount =amount -500;
      
    }
    while (amount>200){
      rupees200++;
      amount =amount-200;
    }
    while(amount>100){
      rupees100++;
      amount = amount-100;
    }
    int total_notes =rupees100+rupees200+rupees500;
    System.out.println("The total number of notes are" +total_notes);
  }
}