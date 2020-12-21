/*This program inputs a sentence and reverses the characters of each word
 * Input is taken using Scanner class 
 */
import java.util.*;
class Question20
{
    void check()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String s=sc.nextLine();//STORES STRING
        s=s+" ";//TO GET THE LAST WORD
        int l=s.length();
        int d=0;
        String ans="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);//EXTRACTS CHARACTER         
            if(ch==' ')//SINCE WORDS ARE SEPARATED BY A SPACE
            {
                String t=s.substring(d,i);//TO EXTRACT WORD BEFORE SPACE
                d=i+1;
                String temp="";//TO STORE THE REVERSED WORD
                for(int j=0;j<t.length();j++)
                {
                    temp=t.charAt(j)+temp;//REVERSES THE WORD
                }
                ans=ans+temp+" ";//STORES THE MODIFIED SENTENCE
            }
        }
        ans=ans.trim();//TO REMOVE EXTRA WHITESPACES
        System.out.println(ans);//DISPLAY STATEMENT
    }
}