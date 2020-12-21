/*THIS PROGRAM ACCEPTS MONTH NUMBER AND DISPLAYS THE NUMBER OF DAYS IN THAT MONTH
 * MONTH NUMBER IS ACCEPTED USING SCANNER CLASS
 */
import java.util.*;
class Question2
{
    void monthDays()//METHOD TO ACCEPT MONTH NUMBER AND DISPLAY NUMBER OF DAYS 
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER MONTH NUMBER");
      int n=sc.nextInt();//STORES THE MONTH NUMBER
      switch(n)//SWITCH BLOCK
      {
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:System.out.println("31 DAYS");break;//FALL THROUGH IMPLEMENTED
          case 6:
          case 9:
          case 11:
          case 4:System.out.println("30 DAYS");break;
          case 2:System.out.println("28/29 DAYS");break;
          default:System.out.println("INVALID INPUT");//FOR INVALID CHOICE
       }
  }
}
           