import java.util.Scanner;

public class vowelornot{
 public static void main(String [] args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a Character");
  char chr=s.next().charAt(0);
  if(!Character.isDigit(chr))
  {
  if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U')
  System.out.println(chr+" is a Vowel");
  else
  System.out.println(chr+" is a Consonent");
  }
  else
  System.out.println("Enter only Alphabets");
}
}
