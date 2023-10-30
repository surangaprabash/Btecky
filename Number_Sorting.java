class Number_Sorting {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Custom input array
        int arr[] = { 4, 3, 2, 1 };
 
        // loop
        for (int i = 0; i < arr.length; i++) {
 
            //  pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {
 
                // Check the elements
                int temp = 0;
                if (arr[j] < arr[i]) {
 
                    // Swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
 
            // Print the sorted array elements
            System.out.print(arr[i] + " ");
        }
    }
}
