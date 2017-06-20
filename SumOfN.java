import java.util.Scanner;

public class SumOfN{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the n value");
  int n=s.nextInt();
  int sum=0;
  if(n>0)
  {
  for(int i=1;i<=n;i++)
  {
  sum=sum+i;
  }
  System.out.println("The sum of "+n+" Natural Numbers is:"+sum);
  }
  else
  System.out.println("Enter a positive number");
 }
}
