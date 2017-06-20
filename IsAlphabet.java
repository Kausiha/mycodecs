import java.util.Scanner;

public class IsAlphabet{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a Character");
  char chr=s.next().charAt(0);
  if(Character.isLetter(chr))
   System.out.println(chr+" is an Alphabet");
  else
   System.out.println(chr+" is not an Alphabet");
 }
}
