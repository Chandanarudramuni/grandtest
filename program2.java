import java .util.Scanner;
public class program2{
  public static void main (String[]args){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the elements of array");
    int n = s.nextInt();
    System.out.println("Enter the elements of the arry");
    int[]arr = new int[n];

    for( int i =0;i<n;i++){
      arr[i]=s.nextInt();
      
    }
    System.out.println("Enter the value");
    int m = s.nextInt();
    for(int j=0;j<n;j++){
      int new_index=(j-m+n)%n;
      int temp =arr[new_index];
      arr[new_index]=arr[j];
      arr[j]= temp;
      
    }
    for(int i =0;i<n;i++){
      System.out.println(arr[i]+"");
    }
  }
}