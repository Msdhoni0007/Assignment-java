import java.util.Scanner;

public class Solution {

    public static String removeDuplicates(String str,String temp,int index){

         if(str.equals(""))
             return "String is empty";
         if(str.length() == 1)
             return str;//a
         if(index < 0)
             return temp;//a


        if(index == str.length()-1 && str.charAt(index) != str.charAt(index-1))
            temp =str.charAt(index)+temp;//b
        else if(index >= 1 && str.charAt(index) != str.charAt(index-1) && str.charAt(index) != str.charAt(index+1))
            temp = str.charAt(index)+temp;
        else if(index == 0){
            if(str.charAt(index) != str.charAt(index+1))
                temp = str.charAt(index)+temp;//temp=a
        }


        return removeDuplicates(str,temp,index-1);//r(abb,"",1),r(abb,"",0),r(abb,a,-1)

     }
 public static String check(String str,String temp,int i)
  {
      String s = "";
      s = removeDuplicates(str,temp,i);//rem(abb,"",2),rem(a,"",0),rem(a,"",0)
      if(s.equals(str))
          return s;//a
      else 
           return check(s,"",s.length()-1);//check(a,"",0),check(a,"",0)
 }
 public static void main(String[] args)
    {
        String str ;
        String temp= "";
        Scanner sc =  new Scanner(System.in);
        str = sc.next();//abb
        temp = check(str,temp,str.length()-1);//check(abb,"",2)
        System.out.println(temp);//a
    }
}
