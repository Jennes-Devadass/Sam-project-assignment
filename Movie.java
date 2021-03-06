/* This program displays ticket to a movie with the final amount calculated
 * Price for afternoon show=150$ per person
 * Price for evening show=200$ per person
 * Price for night show=100$ per person
 */
import java.util.*;
class Movie
{
     String name;
    int show,rate,n;
    char ch;
    float amt;
     Movie()//DEFAULT CONSTRUCTOR
    {
        name="";
        show=0;
        rate=0;
        n=0;
        amt=0;
        ch='\u0000';
    }
     void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME");
        name=sc.nextLine();//STORES NAME
        name=name.toUpperCase();
        System.out.println("ENTER a-Jurassic World(Screen 1)\n      b-Jumanji(Screen 2)\n      c-Avengers(Screen 3)");
        ch=sc.next().trim().charAt(0);//STORES MOVIE 
        System.out.println("Enter 1-afternoon show(11 am)\n      2-evening show(5 pm)\n      3-night show(10 pm)");
        show=sc.nextInt();//STORES SHOW
        System.out.println("Enter number of persons");
        n=sc.nextInt();//STORES NUMBER OF PERSONS
    }
    void calculate()//TO CALCULATE TOTAL AMOUNT
    {
        switch(show)
        {
            case 1:amt=n*150;
                   break;
            case 2:amt=n*200;
                   break;
            case 3:amt=n*100;
                   break;                           
        }  
    }
    void display()//TO DISPLAY TICKET
    {
        System.out.println("TICKET:");
        System.out.print("MOVIE(SCREEN):");
        switch(ch)//TO DISPLAY MOVIE AND SCREEN
        {
            case 'a':System.out.println(" Jurassic World(Screen 1)");break;
            case 'b':System.out.println(" Jumanji(Screen 2)");break;
            case 'c':System.out.println(" Avengers(Screen 3)");break;
        }
        System.out.print("SHOW:");
        switch(show)//TO DISPLAY SHOW
        {
            case 1:System.out.println("Afternoon show(11 am)");
                   break;
            case 2:System.out.println("Evening show(5 pm)");
                   break;
            case 3:System.out.println("Night show(10 pm)");
                   break;                           
        }  
        System.out.println("NO. OF PERSONS :"+n);
        System.out.println("TOTAL AMOUNT : $"+amt);
        System.out.println("NAME OF THE CUSTOMER:"+name);
    }
    public static void main()
    {
        Movie obj=new Movie();//CALL TO DEFAULT CONSTRUCTOR
        obj.accept();
        obj.calculate();
        obj.display();//METHOD CALLS
    }
}
            
        
           