/*THIS PROGRAM ACCEPTS A NUMBER AND OFFERS THE USER A CHOICE
 * 1)IF USER ENTERS 1 THE PROGRAM CHECKS IF THE NUMBER ENTERRED IS A BUZZ NUMBER OR NOT
 *                                                    A BUZZ NUMBER IS A NUMBER WHICH IS EITHER DIVISIBLE BY 7 OR HAS ITS LAST DIGIT AS 7
 * 2)IF USER ENTERS 2 THE PROGRAM CHECKS IF THE NUMBER ENTERRED IS NON PRIME OR NOT
 * THE PROGRAM ALSO DISPLAYS AN ERROR MESSAGE FOR INVALID INPUT
 */
import java.util.Scanner;
class Question11
{
    private static int n;
    private int Buzz(int a)//THIS METHOD CHECKS IF a IS BUZZ OR NOT BY DIVIDING BY 7 OR CHECKING IF ITS LAST DIGIT IS 7
    {
        int d=a%10;
        if(a%7==0||d==7)//CHECKS IF a IS BUZZ OR NOT
        return 1;
        else 
         return 0;
    }
    private int Comp(int a)//THIS METHOD CHECKS IF A NUMBER IS NON PRIME OR NOT
    {
       int ctr=0;
       for(int i=1;i<=a;i++)
       {
          if(a%i==0)
          ctr++;//TO COUNT NUMBER OF FACTORS
       }
       if(ctr==2)//TO CHECK IF NUMBER IS PRIME OR NOT
        return 0;
        else
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Question11 obj=new Question11();//CALL TO DEFAULT CONSTRUCTOR
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        System.out.println("ENTER 1 FOR CHECKING BUZZ NUMBER");
        System.out.println("ENTER 2 FOR CHECKING NON PRIME NUMBER");
        int ch=sc.nextInt();//ACCEPTS USER'S CHOICE  
        int a=0;
        switch(ch)
        {
            case 1:a=obj.Buzz(n);// TO COLLECT VALUE RETURNED
                   if(a==1)
                   System.out.println(n+" IS A BUZZ NUMBER");
                   else
                   System.out.println(n+" IS NOT A BUZZ NUMBER");
                   break;
            case 2:a=obj.Comp(n);//TO COLLECT THE VALUE RETURNED
                   if(a==1)
                   System.out.println(n+" IS NOT A PRIME NUMBER");
                   else
                   System.out.println(n+" IS A PRIME NUMBER");
                   break;
            default:System.out.println("INVLAID INPUT");//DEFAULT CASE IF INPUT ENTERRRED IS INVALID
        }
    }
}
        