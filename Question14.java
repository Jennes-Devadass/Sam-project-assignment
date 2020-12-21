
/*THIS PROGRAM DEMONSTRATES A COPY CONSTRUCTOR
 * HERE A DIRECT ENTRY COPY CONSTRUCTOR IS USED
 */
class Question14
{
    static void main()
    {
        Call obj1=new Call(2,3);
        Call obj2=new Call(obj1);//contents of obj are copied to obj2
        System.out.print("OBJECT 1 ");
        obj1.add();//FUNCTION CALL
        System.out.print("OBJECT 2 ");
        obj2.add();
    }
}
class Call
{
    int a,b;//INSTANCE VARIABLES OF THIS CLASS
    Call(int x,int y)
    {
        a=x;
        b=y;
    }
    Call(Call obj3)
    {
        a=obj3.a;
        b=obj3.b;
    }
    void add()
    {
        System.out.print(a+b);
        System.out.println(" for object ref "+this);
    }
}
   
        