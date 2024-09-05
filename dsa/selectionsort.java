public class selectionsort {
    public static void main(String[] args)
    {
        int min=0,i;
        int[] arr={7,4,10,8,3,1};
        for(i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }

        for( i=0;i<arr.length-1;i++)
        {
             min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                   min=j;
                }
                
            }
        }
        
        if(min!=i)
        {
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }

        for(i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
/*public class selectionsort {
    public static void main(String[] args) {
        int min, i;
        int[] arr = {7, 4, 10, 8, 3, 1};

        // Print original array
        System.out.print("Original array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Selection Sort
        for (i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // Swap if min is not the position of the current element
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}*/

