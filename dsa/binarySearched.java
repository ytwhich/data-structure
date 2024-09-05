import java.util.*;
public class binarySearched {
    public static int  printSearch(int arr[],int key)
    {
        int low=0,high=arr.length-1,mid;
        while(low<=high)
        {
            mid=low+high/2;
            if(arr[mid]==key)
            {
               return mid;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int []arr={32,35,56,98,100};
        int key=35;
        int result=printSearch(arr,key);

        System.out.print( "elements are found in index" + result);


    }
    
}
