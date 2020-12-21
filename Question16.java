import java.util.*;
class Question16
{
    static void binarySearch()
    {
        Scanner sc=new Scanner(System.in);
        int a[]={23,45,56,67,78};
        System.out.println("ENTER THE NUMBER TO BE SEARCHED");
        int el=sc.nextInt();
        int low=0,high=a.length-1,mid=0,pos=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==el)
            {
                pos=mid;
                break;
            }
            else if(a[mid]<el)
            low=mid+1;
            else
            high=mid-1;
        }
        if(pos>-1)
          System.out.println("ELEMENT FOUND AT INDEX NUMBER: "+pos);
        else 
          System.out.println("ELEMENT NOT FOUND");
    }
}  