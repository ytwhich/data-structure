public class bubblesort {


    public static void printout(int arr1[]){
        for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");
       }
    } 

    public static void main(String[] args)
    {
        int[] arr1={7,8,4,3,1};
       for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=0;j<arr1.length-i-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }
            }
        }
        printout(arr1);
    

    }
    
}
