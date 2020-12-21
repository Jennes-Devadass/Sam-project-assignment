/*This program inputs name and basic salary using Buffered Reader of an employee and
calculates and displays the name and Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.io.*;
class Question4
{
    void salary()throws IOException//TO HANDLE IOEXCEPTION
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER NAME");
        String s=br.readLine();//STORES THE NAME
        System.out.println("ENTER BASIC SALARY");
        int b=Integer.parseInt(br.readLine());//STORES BASIC SALARY
        double hra=0,da=0,g=0;
        if(b>0&&b<=10000)
        {
            hra=20.0/100*b;
            da=80.0/100*b;
        }
        else if(b>10000&&b<=20000)
        {
            hra=25.0/100*b;
            da=90.0/100*b;
        }
        else if(b>20000)
        {
            hra=35.0/100*b;
            da=95.0/100*b;
        }
        else
        System.out.println("INVALID INPUT");
        g=(double)b+hra+da;//CALCULATES GROSS       
        System.out.println("NAME         :"+s);        
        System.out.println("GROSS SALARY :"+g); //DISPLAY STATEMENTS
    }
}