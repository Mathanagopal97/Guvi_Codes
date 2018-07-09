import java.util.*;
class Factorial
{
public static void main(String [] args)
{
int num;
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
int fact=1;
for(int i=1;i<=num;i++)
{
fact = fact*i;
}
System.out.println(fact);
}
}
