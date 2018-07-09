import java.util.*;

class RevNum
{
public static void main(String [] args)
{
int num;
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
int revnum=0;
if(num<0) System.out.println("Invalid Input");
else
{
while(num>0)
{
int rem;
rem = num%10;
revnum = revnum*10+rem;
num = num/10;
}
System.out.println(revnum);
}

}
}
