import java.util.*;
public class application3
{public static void main(String[] args)
{int m,n,p,temp,smallest,largest,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three number");
 m=sc.nextInt();
 n=sc.nextInt();
 p=sc.nextInt();
int sum=m+n+p;
double avg=(m+n+p)/3;
int product=m*n*p;
temp=m<n?m:n;
smallest=temp<p?temp:p;
t=m>n?m:n;
largest=t>p?t:p;
System.out.println("Sum is:"+sum);
System.out.println("Average is:"+avg );
System.out.println("Product is:"+product);
System.out.println("Smallest of the three is:"+smallest);
System.out.println("Largest of the three is:"+largest);
}
}



 