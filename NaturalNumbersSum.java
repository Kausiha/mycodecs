import java.util.Scanner;

public class NaturalNumbersSum{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of Natural Numbers:");
  int n=s.nextInt();
  if(n>0)
  {
  int sum=n*(n+1)/2;
  System.out.println("The sum of first "+n+" Natural Numbers is:"+sum);
  }
  else
  System.out.println("Enter a positive number");
 }
}
