import java.util.Scanner;
public class Divide 
{
public static void main(String[] args) 
{
Scanner input = new Scanner (System.in);
System.out.print("Input your first number: ");
int fnum = input.nextInt();
System.out.print("Input your last number: ");
int lnum = input.nextInt();
int remain=(fnum/lnum);
System.out.println();
System.out.println(+remain);
}
}