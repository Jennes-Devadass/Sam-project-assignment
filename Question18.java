

/*This program inputs a 3 word name in a single String .The expected output is as
follows.
 INPUT – Ram Manohar Lohiya
 OUTPUT – R. M. Lohiya
 * 
 */ 
import java.util.*;
class Question18
{
    void initials()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NAME");
        String s=sc.nextLine();
        s=s.trim();//TO REMOVE EXTRA WHITESPACES
        int l=s.length(),d=0;
        String ans="";
        for(int i=0;i<=s.lastIndexOf(' ');i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                String t=s.substring(d,i);
                d=i+1;
                ans=ans+t.charAt(0)+".";//TO GET INITIALS OF 1ST 2 NAMES
            }
        }
        ans=ans+s.substring(s.lastIndexOf(' ')+1);//FINAL RESULT
        System.out.println(ans);//DISPLAY STATEMENT
    }
}
                