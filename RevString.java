import java.util.*;

class RevString
{
public static void main(String [] args)
{
String input;
Scanner sc = new Scanner(System.in);
input = sc.next();
input+=sc.nextLine();
StringBuilder sb = new StringBuilder(input);
sb.reverse();
System.out.println(sb);
}
}
