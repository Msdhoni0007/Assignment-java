import java.util.*;
public class Solution
{public String remove(String s)
{String res=s;
String temp="";
 while(temp.length()!=res.length())
{temp=res;
 res=solve(res);
}
return res;
}
public String solve(String s)
{int i=0,n=s.length();
String ans="";
while(i<n)
{if(i<n-1 && s.charAt(i)==s.charAt(i+1))
{while(i<n-1 &&s.charAt(i)==s.charAt(i+1))
++i;
}
else
   ans+=s.charAt(i);
i++;
}
return ans;
}
public static void main(String[] args)
{String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
s=sc.next();
 Solution c =new Solution();
String s1=c.remove(s);
System.out.println("String after removing adjacent duplicates :"+s1);
}
}