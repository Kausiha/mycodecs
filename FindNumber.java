import java.util.Scanner;

public class number{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a Number");
  int num=s.nextInt();
  if(num>0){
  System.out.println("It is a Positive Number");
  }
  else if(num==0){
  System.out.println("It is Zero");
  }
  else{
  System.out.println("It is a Negative Number");
  }
 }
}
