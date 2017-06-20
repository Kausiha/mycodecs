import java.util.Scanner;

public class CountOfIntegers{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a Number");
  int num,q,r,i=0,num1;
  num=s.nextInt();
  num1=num;
  while(num!=0)
  {
   q=num/10;
   r=num%10;
   num=q;
   i++;
  }
  System.out.println("The Number of Digits in "+num1+" is "+i);
  }
}
