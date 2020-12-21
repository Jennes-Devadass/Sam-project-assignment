/*THIS PROGRAM ACCEPTS 3 SIDES OF A TRIANGLE,CHECKS AND DISPLAYS IF THE TRIANGLE IS SCALENE,ISOCELES OR EQUILATERAL
 * AN EQUILATERAL TRIANGLE IS A TRIANGLE IN WHICH ALL 3 SIDES ARE OF EQUAL LENGTH
 * AN ISOCELES TRIANGLE IS A TRIANGLE IN WHICH ANY 2 SIDES ARE OF EQUAL LENGTH
 * A SCALENE TRIANGLE IS A TRIANGLE WITH ALL 3 SIDES OF DIFFERENT LENGTH
 */
import java.io.*;
class Question1
{
    private void checkTriangleType()throws IOException//TO HANDLE IOEXCEPTION
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("ENTER THE 3 SIDES OF A TRIANGLE");
     int a=Integer.parseInt(br.readLine());//INPUTS 1ST SIDE
     int b=Integer.parseInt(br.readLine());//INPUTS 2ND SIDE
     int c=Integer.parseInt(br.readLine());//INPUTS 3RD SIDE
     if((a+b>=c||b+c>=a||a+c>=b)&&(a>0&&b>0&&c>0))
     {
       if(a==b&&a==c&&b==c)//ALL SIDES SHOULD BE EQUAL
           System.out.println("THESE ARE THE SIDES OF AN EQUILATERAL TRIANGLE");
       else if(a==b||a==c||b==c)//ANY TWO SIDES SHOULD BE EQUAL
           System.out.println("THESE ARE THE SIDES OF AN ISOCELES TRIANGLE");
       else if(a!=b&&a!=c&&b!=c)//NO SIDE SHOULD BE EQUAL
           System.out.println("THESE ARE THE SIDES OF A SCALENE TRIANGLE");
     }
     else
     System.out.println("INVALID INPUT");
    }
    public static void main(String args[])throws IOException
    
    {
        Question1 obj=new Question1();
        obj.checkTriangleType();
          
    }
}
        
    
        
        
    
       
