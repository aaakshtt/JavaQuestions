package DataAlgo;

public class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)            //Will take three paraneters arr, d,n
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];                              //Store first value in a temproary 
        for (i = 0; i < n - 1; i++)                 //Print remaining elements
            arr[i] = arr[i + 1];                    // 2,3,4,5,6,7
        arr[n-1] = temp;                            //1
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 1, 7);
        rotate.printArray(arr, 7);
    }
}
