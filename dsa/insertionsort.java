public class insertionsort {


    public static void printout(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
       }
    } 

    public static void main(String[] args)
    {

        int j;
        int[] arr={5,4,10,1,6,2};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            j=i-1;

            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        printout(arr);


    }
    
}
