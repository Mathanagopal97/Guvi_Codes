import java.util.*;
class Isom
{
public static void main(String [] args)
{
int flag=0;
Scanner sc = new Scanner(System.in);
String inp1 = sc.next();
String inp2 = sc.next();
if(inp1==null||inp2==null)
        flag=1;
 
  else  if(inp1.length()!=inp2.length())
        flag=1;
 else
 {
     HashMap<Character, Character> map = new HashMap<Character, Character>();
 
 
    for(int i=0; i<inp1.length(); i++){
        char c1 = inp1.charAt(i);
        char c2 = inp2.charAt(i);
 
        if(map.containsKey(c1)){
            if(map.get(c1)!=c2)
                flag=1;
        }else{
            if(map.containsValue(c2))
                flag=1;
            map.put(c1, c2);
        }
    }
 }
 
if(flag==0) System.out.println("yes");
else System.out.println("no");

}

}