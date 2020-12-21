/*This program inputs  a number using Scanner input and checks if it is a Strong Number or
 not. Likewise display appropriate message “STRONG NUMBER “ or “NOT A STRONG
 NUMBER”
*A strong number is a number in which the sum of the factorial of the digits is equal
 to the number itself
 */
import java.util.*;
class Question5
{
    void checkStrong()//METHOD TO CHECK FOR STRONG NUMBER
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();//STORES THE NUMBER
        int d=0,temp=n,f=0,s=0;
        while(temp>0)
        {
            d=temp%10;
            temp/=10;//DIGIT EXTRACTION
            f=0;
            for(int i=1;i<=d;i++)
            f*=d;//CALCULATES FACTORIAL
            s+=f;//CALCULATES SUM OF FACTORIAL OF DIGITS
        }
        if(s==n)//CHECKS IF SUM IS EQUAL TO NUMBER
        System.out.println("STRONG NUMBER");
        else
        System.out.println("NOT A STRONG NUMBER");
    }
}