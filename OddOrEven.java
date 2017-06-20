import java.util.Scanner;

public class OddOrEven{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a Number");
  int num=s.nextInt();
  if(num%2==0){
  System.out.println(num+" is a Even Number");
 }
  else
  System.out.println(num+" is a Odd Number");
}
}
