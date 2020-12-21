/*This program calculates sum as
 * S=(1*2)+(2*3)....n terms
 * The program gives a call to function sum in the main function
 */
import java.io.*;
class Question10
{
    private int sum(int n)
    {
        int s=0;
        for(int i=1;i<=n;i++)
        s=s+(i*(i+1));//CALCULATES SUM UPTO n TERMS
        return s;
    }
    public static void main(String args[])throws IOException//TO HANDLE IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER VALUE OF n");
        int a=Integer.parseInt(br.readLine());//INPUT STATEMENT
        Question10 obj=new Question10();//OBJECT CREATION
        int s=obj.sum(a);//FUNCTION CALL
        System.out.println(s);
    }
}