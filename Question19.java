/*This program prints all duplicate character and their count
 *Input is taken using Buffered Reader 
 */ 
import java.io.*;
class Question19
{
    void countDuplicate()throws IOException//TO HANDLE EXCEPTION
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A WORD");
        String s=br.readLine();
        s=s.trim();
        s=s.toLowerCase();
        int l=s.length();//STORES LENGTH
        int ctr=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);//EXTRACTS CHARACTER
            ctr=0;
            for(int j=i;j<l;j++)
            {
                char c=s.charAt(j);
                if(ch==c&&ch!=' ')//ONLY APPLICABLE FOR A WORD
                ctr++;//INCREASES COUNT
            }
            s=s.replace(ch,' ');//REPLACES CHECKED CHARACTERS WITH WHITESPACE
            if(ctr>1)
            System.out.print(ch+":"+ctr+"\t");//DISPLAY STATEMENT
        }
    }
}
                            
            
        